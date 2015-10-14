package app.training.example.com.geoquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends AppCompatActivity {

    private static final String LOG_TAG = CheatActivity.class.getSimpleName();
    public static final String EXTRA_ANSWER_IS_TRUE = "app.training.example.com.geoquiz.answer_is_true";

    private boolean mAnswerIsTrue;
    private Button mShowAnswerButton;
    private TextView mAnswerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);

        mAnswerTextView = (TextView) findViewById(R.id.answer_text_view);

        mShowAnswerButton = (Button) findViewById(R.id.show_answer_button);
        mShowAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //If true set text to true if false set text to false
                mAnswerTextView.setText((mAnswerIsTrue) ? R.string.true_button_text : R.string.false_button_text);
            }
        });
    }
}

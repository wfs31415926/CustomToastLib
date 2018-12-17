package com.wufs.customtoastlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wufs.toastlib.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tv_text)
    TextView tvText;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.button2)
    Button button2;
    @BindView(R.id.button3)
    Button button3;
    @BindView(R.id.button4)
    Button button4;
    @BindView(R.id.button5)
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.button, R.id.button2, R.id.button3, R.id.button4, R.id.button5})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button:
                tvText.setText("1");
                ToastUtils.showLongCenterToast(this, "长中间");
                break;
            case R.id.button2:
                tvText.setText("2");
                ToastUtils.showShortCenterToast(this, "短中间");
                break;
            case R.id.button3:
                tvText.setText("3");
                ToastUtils.showLongToast(this, "长下部");
                break;
            case R.id.button4:
                tvText.setText("4");
                ToastUtils.showShortToast(this, "短下部");
                break;
            case R.id.button5:
                tvText.setText("5");
                ToastUtils.showToastWithImg(this, "带图", getResources().getDrawable(R.drawable.smile));
                break;
        }
    }


    @OnClick()
    public void onViewClicked() {
    }
}

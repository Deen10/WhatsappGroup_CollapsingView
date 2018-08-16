package com.md.whatsappgroup_collapseview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class HeaderView extends RelativeLayout {

    @BindView(R.id.name)
    TextView tvName;

    @BindView(R.id.description)
    TextView tvDescription;

    public HeaderView(Context context) {
        super(context);
    }

    public HeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HeaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public HeaderView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);
    }

    public void bindTo(String name, String lastSeen) {
        this.tvName.setText(name);
        this.tvDescription.setText(lastSeen);
    }

    public void setTextSize(float size) {
        tvName.setTextSize(TypedValue.COMPLEX_UNIT_PX, size);
    }

}

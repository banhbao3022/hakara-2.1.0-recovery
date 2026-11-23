package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import java.util.Objects;
import mtp.media.karaoke.R;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class HelpTextView extends LinearLayout {
    private TextView zzom;
    private TextView zzon;

    @Keep
    public HelpTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void zza(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Keep
    public View asView() {
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.cast_featurehighlight_help_text_header_view);
        Objects.requireNonNull(textView);
        this.zzom = textView;
        TextView textView2 = (TextView) findViewById(R.id.cast_featurehighlight_help_text_body_view);
        Objects.requireNonNull(textView2);
        this.zzon = textView2;
    }

    @Keep
    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        zza(this.zzom, charSequence);
        zza(this.zzon, charSequence2);
    }
}

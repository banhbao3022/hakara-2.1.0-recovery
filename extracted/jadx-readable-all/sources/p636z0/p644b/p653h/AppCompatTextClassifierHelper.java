package p636z0.p644b.p653h;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: renamed from: z0.b.h.w, reason: use source file name */
/* JADX INFO: compiled from: AppCompatTextClassifierHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class AppCompatTextClassifierHelper {

    /* JADX INFO: renamed from: a */
    public TextView f35239a;

    /* JADX INFO: renamed from: b */
    public TextClassifier f35240b;

    public AppCompatTextClassifierHelper(TextView textView) {
        this.f35239a = textView;
    }

    /* JADX INFO: renamed from: a */
    public TextClassifier m14983a() {
        TextClassifier textClassifier = this.f35240b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f35239a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }
}

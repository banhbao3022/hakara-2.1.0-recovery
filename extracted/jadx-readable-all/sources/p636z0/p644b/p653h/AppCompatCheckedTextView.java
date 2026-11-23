package p636z0.p644b.p653h;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p636z0.p644b.C7462a;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.b.h.h, reason: use source file name */
/* JADX INFO: compiled from: AppCompatCheckedTextView.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* JADX INFO: renamed from: f */
    public static final int[] f35035f = {R.attr.checkMark};

    /* JADX INFO: renamed from: g */
    public final AppCompatTextHelper f35036g;

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatTextHelper appCompatTextHelper = this.f35036g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14986b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C7462a.m14577n(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AppCompatResources.m14707b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C8162a.m16055Z(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.f35036g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14989f(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintContextWrapper.m14982a(context);
        ThemeUtils.m14962a(this, getContext());
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f35036g = appCompatTextHelper;
        appCompatTextHelper.m14988e(attributeSet, i);
        appCompatTextHelper.m14986b();
        TintTypedArray tintTypedArrayM14998r = TintTypedArray.m14998r(getContext(), attributeSet, f35035f, i, 0);
        setCheckMarkDrawable(tintTypedArrayM14998r.m15005g(0));
        tintTypedArrayM14998r.f35267b.recycle();
    }
}

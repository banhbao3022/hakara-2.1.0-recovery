package p636z0.p644b.p653h;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p636z0.p644b.C7462a;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ContentInfoCompat;
import p636z0.p725k.p739l.OnReceiveContentViewBehavior;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p741c0.EditorInfoCompat;
import p636z0.p725k.p739l.p741c0.InputConnectionCompat;
import p636z0.p725k.p739l.p741c0.InputConnectionCompat2;
import p636z0.p725k.p742m.TextViewOnReceiveContentListener;

/* JADX INFO: renamed from: z0.b.h.k, reason: use source file name */
/* JADX INFO: compiled from: AppCompatEditText.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements OnReceiveContentViewBehavior {

    /* JADX INFO: renamed from: f */
    public final AppCompatBackgroundHelper f35079f;

    /* JADX INFO: renamed from: g */
    public final AppCompatTextHelper f35080g;

    /* JADX INFO: renamed from: h */
    public final AppCompatTextClassifierHelper f35081h;

    /* JADX INFO: renamed from: i */
    public final TextViewOnReceiveContentListener f35082i;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    @Override // p636z0.p725k.p739l.OnReceiveContentViewBehavior
    /* JADX INFO: renamed from: a */
    public ContentInfoCompat mo14915a(ContentInfoCompat contentInfoCompat) {
        return this.f35082i.mo16303a(this, contentInfoCompat);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35079f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14876a();
        }
        AppCompatTextHelper appCompatTextHelper = this.f35080g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14986b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35079f;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m14877b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35079f;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m14878c();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        return (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.f35081h) == null) ? super.getTextClassifier() : appCompatTextClassifierHelper.m14983a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] stringArray;
        InputConnection inputConnectionCompat2;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f35080g.m14990g(this, inputConnectionOnCreateInputConnection, editorInfo);
        C7462a.m14577n(inputConnectionOnCreateInputConnection, editorInfo, this);
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        String[] strArr = (String[]) getTag(R.id.tag_on_receive_content_mime_types);
        if (inputConnectionOnCreateInputConnection == null || strArr == null) {
            return inputConnectionOnCreateInputConnection;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 25) {
            editorInfo.contentMimeTypes = strArr;
        } else {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
            editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        }
        AppCompatReceiveContentHelper appCompatReceiveContentHelper = new AppCompatReceiveContentHelper(this);
        if (editorInfo == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        }
        if (i >= 25) {
            inputConnectionCompat2 = new InputConnectionCompat(inputConnectionOnCreateInputConnection, false, appCompatReceiveContentHelper);
        } else {
            if (i >= 25) {
                stringArray = editorInfo.contentMimeTypes;
                if (stringArray == null) {
                    stringArray = EditorInfoCompat.f38047a;
                }
            } else {
                Bundle bundle = editorInfo.extras;
                if (bundle == null) {
                    stringArray = EditorInfoCompat.f38047a;
                } else {
                    String[] stringArray2 = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                    stringArray = stringArray2 == null ? editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES") : stringArray2;
                    if (stringArray == null) {
                        stringArray = EditorInfoCompat.f38047a;
                    }
                }
            }
            if (stringArray.length == 0) {
                return inputConnectionOnCreateInputConnection;
            }
            inputConnectionCompat2 = new InputConnectionCompat2(inputConnectionOnCreateInputConnection, false, appCompatReceiveContentHelper);
        }
        return inputConnectionCompat2;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (((String[]) getTag(R.id.tag_on_receive_content_mime_types)) != null) {
                Context context = getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    }
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (activity == null) {
                    Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
                } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                    activity.requestDragAndDropPermissions(dragEvent);
                    int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                    beginBatchEdit();
                    try {
                        Selection.setSelection((Spannable) getText(), offsetForPosition);
                        ViewCompat.m16322p(this, new ContentInfoCompat(new ContentInfoCompat.a(dragEvent.getClipData(), 3)));
                        endBatchEdit();
                        z = true;
                    } catch (Throwable th) {
                        endBatchEdit();
                        throw th;
                    }
                }
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        int i2 = 0;
        if (i == 16908322 || i == 16908337) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (((String[]) getTag(R.id.tag_on_receive_content_mime_types)) != null) {
                ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                if (primaryClip != null && primaryClip.getItemCount() > 0) {
                    ContentInfoCompat.a aVar = new ContentInfoCompat.a(primaryClip, 1);
                    aVar.f38044c = i != 16908322 ? 1 : 0;
                    ViewCompat.m16322p(this, new ContentInfoCompat(aVar));
                }
                i2 = 1;
            }
        }
        if (i2 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35079f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14880e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35079f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14881f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C8162a.m16055Z(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35079f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14883h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35079f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14884i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.f35080g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14989f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.f35081h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            appCompatTextClassifierHelper.f35240b = textClassifier;
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintContextWrapper.m14982a(context);
        ThemeUtils.m14962a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f35079f = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m14879d(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f35080g = appCompatTextHelper;
        appCompatTextHelper.m14988e(attributeSet, i);
        appCompatTextHelper.m14986b();
        this.f35081h = new AppCompatTextClassifierHelper(this);
        this.f35082i = new TextViewOnReceiveContentListener();
    }
}

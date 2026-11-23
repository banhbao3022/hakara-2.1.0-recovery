package p636z0.p725k.p739l.p741c0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import p636z0.p644b.p653h.AppCompatReceiveContentHelper;

/* JADX INFO: renamed from: z0.k.l.c0.c, reason: use source file name */
/* JADX INFO: compiled from: InputConnectionCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class InputConnectionCompat2 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InputConnectionCompat3 f38049a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputConnectionCompat2(InputConnection inputConnection, boolean z, InputConnectionCompat3 inputConnectionCompat3) {
        super(inputConnection, z);
        this.f38049a = inputConnectionCompat3;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) throws Throwable {
        boolean z;
        ResultReceiver resultReceiver;
        InputConnectionCompat3 inputConnectionCompat3 = this.f38049a;
        boolean zM14951a = false;
        zM14951a = false;
        zM14951a = false;
        zM14951a = false;
        if (bundle != null) {
            if (!TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z = TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str);
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                try {
                    Uri uri = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                    ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                    Uri uri2 = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                    int i = bundle.getInt(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                    Bundle bundle2 = (Bundle) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                    if (uri != null && clipDescription != null) {
                        zM14951a = ((AppCompatReceiveContentHelper) inputConnectionCompat3).m14951a(new InputContentInfoCompat(uri, clipDescription, uri2), i, bundle2);
                    }
                    if (resultReceiver != null) {
                        resultReceiver.send(zM14951a ? 1 : 0, null);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = null;
            }
        }
        if (zM14951a) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}

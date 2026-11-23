package p636z0.p725k.p739l.p741c0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p636z0.p644b.p653h.AppCompatReceiveContentHelper;

/* JADX INFO: renamed from: z0.k.l.c0.b, reason: use source file name */
/* JADX INFO: compiled from: InputConnectionCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class InputConnectionCompat extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InputConnectionCompat3 f38048a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputConnectionCompat(InputConnection inputConnection, boolean z, InputConnectionCompat3 inputConnectionCompat3) {
        super(inputConnection, z);
        this.f38048a = inputConnectionCompat3;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        InputConnectionCompat3 inputConnectionCompat3 = this.f38048a;
        InputContentInfoCompat inputContentInfoCompat = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            inputContentInfoCompat = new InputContentInfoCompat(new InputContentInfoCompat.a(inputContentInfo));
        }
        if (((AppCompatReceiveContentHelper) inputConnectionCompat3).m14951a(inputContentInfoCompat, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}

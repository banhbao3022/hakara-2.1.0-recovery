package p636z0.p644b.p653h;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import p636z0.p725k.p739l.ContentInfoCompat;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p741c0.InputConnectionCompat3;
import p636z0.p725k.p739l.p741c0.InputContentInfoCompat;

/* JADX INFO: renamed from: z0.b.h.s, reason: use source file name */
/* JADX INFO: compiled from: AppCompatReceiveContentHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatReceiveContentHelper implements InputConnectionCompat3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f35176a;

    public AppCompatReceiveContentHelper(View view) {
        this.f35176a = view;
    }

    /* JADX INFO: renamed from: a */
    public boolean m14951a(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                inputContentInfoCompat.f38050a.mo16285b();
                InputContentInfo inputContentInfo = (InputContentInfo) inputContentInfoCompat.f38050a.mo16288e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        ContentInfoCompat.a aVar = new ContentInfoCompat.a(new ClipData(inputContentInfoCompat.f38050a.mo16287d(), new ClipData.Item(inputContentInfoCompat.f38050a.mo16284a())), 2);
        aVar.f38045d = inputContentInfoCompat.f38050a.mo16286c();
        aVar.f38046e = bundle;
        return ViewCompat.m16322p(this.f35176a, new ContentInfoCompat(aVar)) == null;
    }
}

package p636z0.p685e0;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: renamed from: z0.e0.c0, reason: use source file name */
/* JADX INFO: compiled from: WindowIdApi18.java */
/* JADX INFO: loaded from: classes.dex */
public class WindowIdApi18 implements WindowIdImpl {

    /* JADX INFO: renamed from: a */
    public final WindowId f36424a;

    public WindowIdApi18(View view) {
        this.f36424a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof WindowIdApi18) && ((WindowIdApi18) obj).f36424a.equals(this.f36424a);
    }

    public int hashCode() {
        return this.f36424a.hashCode();
    }
}

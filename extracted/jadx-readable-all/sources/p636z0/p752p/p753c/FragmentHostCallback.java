package p636z0.p752p.p753c;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.p.c.w, reason: use source file name */
/* JADX INFO: compiled from: FragmentHostCallback.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentHostCallback<E> extends FragmentContainer {

    /* JADX INFO: renamed from: f */
    public final Activity f38564f;

    /* JADX INFO: renamed from: g */
    public final Context f38565g;

    /* JADX INFO: renamed from: h */
    public final Handler f38566h;

    /* JADX INFO: renamed from: i */
    public final FragmentManager f38567i;

    public FragmentHostCallback(Context context, Handler handler, int i) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i);
    }

    @Override // p636z0.p752p.p753c.FragmentContainer
    /* JADX INFO: renamed from: c */
    public View mo16514c(int i) {
        return null;
    }

    @Override // p636z0.p752p.p753c.FragmentContainer
    /* JADX INFO: renamed from: e */
    public boolean mo16515e() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void mo16580f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* JADX INFO: renamed from: g */
    public abstract E mo16581g();

    /* JADX INFO: renamed from: h */
    public LayoutInflater mo16582h() {
        return LayoutInflater.from(this.f38565g);
    }

    /* JADX INFO: renamed from: i */
    public boolean mo16583i(Fragment fragment) {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo16584j(String str) {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void mo16585k() {
    }

    public FragmentHostCallback(Activity activity, Context context, Handler handler, int i) {
        this.f38567i = new FragmentManagerImpl();
        this.f38564f = activity;
        C8162a.m16063h(context, "context == null");
        this.f38565g = context;
        C8162a.m16063h(handler, "handler == null");
        this.f38566h = handler;
    }
}

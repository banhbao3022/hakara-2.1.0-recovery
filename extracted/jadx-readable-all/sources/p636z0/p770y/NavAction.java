package p636z0.p770y;

import android.os.Bundle;

/* JADX INFO: renamed from: z0.y.c, reason: use source file name */
/* JADX INFO: compiled from: NavAction.java */
/* JADX INFO: loaded from: classes.dex */
public final class NavAction {

    /* JADX INFO: renamed from: a */
    public final int f38988a;

    /* JADX INFO: renamed from: b */
    public NavOptions f38989b;

    /* JADX INFO: renamed from: c */
    public Bundle f38990c;

    public NavAction(int i) {
        this(i, null);
    }

    public NavAction(int i, NavOptions navOptions) {
        this(i, navOptions, null);
    }

    public NavAction(int i, NavOptions navOptions, Bundle bundle) {
        this.f38988a = i;
        this.f38989b = navOptions;
        this.f38990c = bundle;
    }
}

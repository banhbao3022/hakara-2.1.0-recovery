package p007c.p165l.p183m0.p184b;

import android.os.Bundle;
import p007c.p165l.FacebookCallback;
import p007c.p165l.FacebookException;
import p007c.p165l.p178k0.AppCall;

/* JADX INFO: renamed from: c.l.m0.b.k, reason: use source file name */
/* JADX INFO: compiled from: ResultProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResultProcessor {

    /* JADX INFO: renamed from: a */
    public FacebookCallback f5213a;

    public ResultProcessor(FacebookCallback facebookCallback) {
        this.f5213a = facebookCallback;
    }

    /* JADX INFO: renamed from: a */
    public void mo2619a(AppCall appCall, FacebookException facebookException) {
        FacebookCallback facebookCallback = this.f5213a;
        if (facebookCallback != null) {
            facebookCallback.mo2278c(facebookException);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo2620b(AppCall appCall, Bundle bundle);
}

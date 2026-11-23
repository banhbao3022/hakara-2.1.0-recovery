package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007c.p190n.p194b.p266d.p314j.p325k.C4177h;
import p007c.p190n.p194b.p266d.p314j.p325k.C4261n;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7;
import p007c.p190n.p385d.p386j.C5241c;
import p007c.p190n.p385d.p421t.FirebaseInstallations4;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: a */
    public static volatile FirebaseAnalytics f29271a;

    /* JADX INFO: renamed from: b */
    public final C4177h f29272b;

    public FirebaseAnalytics(C4177h c4177h) {
        Objects.requireNonNull(c4177h, "null reference");
        this.f29272b = c4177h;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f29271a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f29271a == null) {
                    f29271a = new FirebaseAnalytics(C4177h.m9633b(context, null, null, null, null));
                }
            }
        }
        return f29271a;
    }

    @Keep
    public static InterfaceC4489d7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C4177h c4177hM9633b = C4177h.m9633b(context, null, null, null, bundle);
        if (c4177hM9633b == null) {
            return null;
        }
        return new C5241c(c4177hM9633b);
    }

    /* JADX INFO: renamed from: a */
    public final void m12913a(String str, Bundle bundle) {
        this.f29272b.m9639e(null, str, bundle, false, true, null);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) C4340s8.m10205b(FirebaseInstallations4.m12098f().mo12110w(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        C4177h c4177h = this.f29272b;
        Objects.requireNonNull(c4177h);
        c4177h.f23198e.execute(new C4261n(c4177h, activity, str, str2));
    }
}

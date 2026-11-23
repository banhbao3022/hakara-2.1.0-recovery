package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.concurrent.ExecutionException;
import p007c.p190n.p194b.p266d.p297e.AbstractC2573b;
import p007c.p190n.p194b.p266d.p297e.C2571a;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p385d.p418r.C5480f;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC2573b {
    @Override // p007c.p190n.p194b.p266d.p297e.AbstractC2573b
    /* JADX INFO: renamed from: a */
    public int mo5172a(Context context, C2571a c2571a) {
        try {
            return ((Integer) C4340s8.m10204a(new C5480f(context).m12067b(c2571a.f11493f))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to send message to service.", e);
            return HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p297e.AbstractC2573b
    /* JADX INFO: renamed from: b */
    public void mo5173b(Context context, Bundle bundle) {
        try {
            C4340s8.m10204a(new C5480f(context).m12067b(new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle)));
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to send notification dismissed event to service.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p297e.AbstractC2573b
    /* JADX INFO: renamed from: c */
    public void mo5174c(Context context, Bundle bundle) {
        try {
            C4340s8.m10204a(new C5480f(context).m12067b(new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(bundle)));
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to send notification open event to service.", e);
        }
    }
}

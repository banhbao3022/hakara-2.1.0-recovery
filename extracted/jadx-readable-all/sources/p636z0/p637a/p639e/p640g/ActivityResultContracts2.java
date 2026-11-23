package p636z0.p637a.p639e.p640g;

import android.content.Context;
import android.content.Intent;
import p636z0.p637a.p639e.ActivityResult;

/* JADX INFO: renamed from: z0.a.e.g.c, reason: use source file name */
/* JADX INFO: compiled from: ActivityResultContracts.java */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityResultContracts2 extends ActivityResultContract<Intent, ActivityResult> {
    @Override // p636z0.p637a.p639e.p640g.ActivityResultContract
    /* JADX INFO: renamed from: a */
    public Intent mo14498a(Context context, Intent intent) {
        return intent;
    }

    @Override // p636z0.p637a.p639e.p640g.ActivityResultContract
    /* JADX INFO: renamed from: c */
    public ActivityResult mo14500c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}

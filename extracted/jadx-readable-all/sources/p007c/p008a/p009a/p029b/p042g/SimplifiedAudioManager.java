package p007c.p008a.p009a.p029b.p042g;

import android.content.Context;
import android.media.AudioManager;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.b.g.d, reason: use source file name */
/* JADX INFO: compiled from: SimplifiedAudioManager.kt */
/* JADX INFO: loaded from: classes.dex */
public class SimplifiedAudioManager {

    /* JADX INFO: renamed from: a */
    public final AudioManager f1809a;

    /* JADX INFO: renamed from: b */
    public Object f1810b;

    public SimplifiedAudioManager(Context context) {
        Intrinsics2.m13090f(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("audio");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.media.AudioManager");
        }
        this.f1809a = (AudioManager) systemService;
    }
}

package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wn1 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final Context f21267a;

    /* JADX INFO: renamed from: b */
    public final AudioManager f21268b;

    /* JADX INFO: renamed from: c */
    public float f21269c;

    /* JADX INFO: renamed from: d */
    public final fo1 f21270d;

    public wn1(Handler handler, Context context, un1 un1Var, fo1 fo1Var, byte[] bArr) {
        super(handler);
        this.f21267a = context;
        this.f21268b = (AudioManager) context.getSystemService("audio");
        this.f21270d = fo1Var;
    }

    /* JADX INFO: renamed from: a */
    public final float m8659a() {
        int streamVolume = this.f21268b.getStreamVolume(3);
        int streamMaxVolume = this.f21268b.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = streamVolume / streamMaxVolume;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: b */
    public final void m8660b() {
        fo1 fo1Var = this.f21270d;
        float f = this.f21269c;
        fo1Var.f14084b = f;
        if (fo1Var.f14086d == null) {
            fo1Var.f14086d = yn1.f21931a;
        }
        Iterator<nn1> it = fo1Var.f14086d.m8807b().iterator();
        while (it.hasNext()) {
            it.next().f17179e.m7599f(f);
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float fM8659a = m8659a();
        if (fM8659a != this.f21269c) {
            this.f21269c = fM8659a;
            m8660b();
        }
    }
}

package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.IOException;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.sn2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"HandlerLeak"})
public final class rn2<T extends sn2> extends Handler implements Runnable {

    /* JADX INFO: renamed from: f */
    public final T f18969f;

    /* JADX INFO: renamed from: g */
    public final qn2<T> f18970g;

    /* JADX INFO: renamed from: h */
    public final int f18971h;

    /* JADX INFO: renamed from: i */
    public final long f18972i;

    /* JADX INFO: renamed from: j */
    public IOException f18973j;

    /* JADX INFO: renamed from: k */
    public int f18974k;

    /* JADX INFO: renamed from: l */
    public volatile Thread f18975l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f18976m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ un2 f18977n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn2(un2 un2Var, Looper looper, T t, qn2<T> qn2Var, int i, long j2) {
        super(looper);
        this.f18977n = un2Var;
        this.f18969f = t;
        this.f18970g = qn2Var;
        this.f18971h = i;
        this.f18972i = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m8300a(long j2) {
        C2622l.m5322V2(this.f18977n.f20382b == null);
        un2 un2Var = this.f18977n;
        un2Var.f20382b = this;
        if (j2 > 0) {
            sendEmptyMessageDelayed(0, j2);
        } else {
            this.f18973j = null;
            un2Var.f20381a.execute(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8301b(boolean z) {
        this.f18976m = z;
        this.f18973j = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            ((sl2) this.f18969f).f19611f = true;
            if (this.f18975l != null) {
                this.f18975l.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.f18977n.f20382b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ((vl2) this.f18970g).m8573r(this.f18969f, jElapsedRealtime, jElapsedRealtime - this.f18972i, true);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        jj2 jj2Var;
        if (this.f18976m) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            this.f18973j = null;
            un2 un2Var = this.f18977n;
            un2Var.f20381a.execute(un2Var.f20382b);
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.f18977n.f20382b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - this.f18972i;
        if (((sl2) this.f18969f).f19611f) {
            ((vl2) this.f18970g).m8573r(this.f18969f, jElapsedRealtime, j2, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            ((vl2) this.f18970g).m8573r(this.f18969f, jElapsedRealtime, j2, false);
            return;
        }
        if (i2 == 2) {
            qn2<T> qn2Var = this.f18970g;
            T t = this.f18969f;
            vl2 vl2Var = (vl2) qn2Var;
            Objects.requireNonNull(vl2Var);
            vl2Var.m8565b((sl2) t);
            vl2Var.f20837J = true;
            if (vl2Var.f20829B == -9223372036854775807L) {
                long jM8568m = vl2Var.m8568m();
                long j3 = jM8568m != Long.MIN_VALUE ? jM8568m + 10000 : 0L;
                vl2Var.f20829B = j3;
                vl2Var.f20845k.mo5793c(new mm2(j3, vl2Var.f20855u.zza()), null);
            }
            vl2Var.f20854t.mo5792b(vl2Var);
            return;
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f18973j = iOException;
        qn2<T> qn2Var2 = this.f18970g;
        T t2 = this.f18969f;
        vl2 vl2Var2 = (vl2) qn2Var2;
        Objects.requireNonNull(vl2Var2);
        sl2 sl2Var = (sl2) t2;
        vl2Var2.m8565b(sl2Var);
        Handler handler = vl2Var2.f20843i;
        if (handler != null) {
            handler.post(new rl2(vl2Var2, iOException));
        }
        char c2 = 0;
        if (iOException instanceof pm2) {
            c2 = 3;
        } else {
            int iM8567l = vl2Var2.m8567l();
            int i3 = vl2Var2.f20836I;
            if (vl2Var2.f20833F == -1 && ((jj2Var = vl2Var2.f20855u) == null || jj2Var.mo5818a() == -9223372036854775807L)) {
                vl2Var2.f20834G = 0L;
                vl2Var2.f20859y = vl2Var2.f20857w;
                int size = vl2Var2.f20853s.size();
                for (int i4 = 0; i4 < size; i4++) {
                    vl2Var2.f20853s.valueAt(i4).m7519e(!vl2Var2.f20857w || vl2Var2.f20830C[i4]);
                }
                sl2Var.f19610e.f14598a = 0L;
                sl2Var.f19613h = 0L;
                sl2Var.f19612g = true;
            }
            vl2Var2.f20836I = vl2Var2.m8567l();
            if (iM8567l > i3) {
                c2 = 1;
            }
        }
        if (c2 == 3) {
            this.f18977n.f20383c = this.f18973j;
        } else if (c2 != 2) {
            int i5 = c2 != 1 ? 1 + this.f18974k : 1;
            this.f18974k = i5;
            m8300a(Math.min((i5 - 1) * CloseCodes.NORMAL_CLOSURE, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f18975l = Thread.currentThread();
            if (!((sl2) this.f18969f).f19611f) {
                String simpleName = this.f18969f.getClass().getSimpleName();
                C2622l.m5441u1(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                try {
                    ((sl2) this.f18969f).m8355a();
                    C2622l.m5305R1();
                } catch (Throwable th) {
                    C2622l.m5305R1();
                    throw th;
                }
            }
            if (this.f18976m) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f18976m) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Error e2) {
            Log.e("LoadTask", "Unexpected error loading stream", e2);
            if (!this.f18976m) {
                obtainMessage(4, e2).sendToTarget();
            }
            throw e2;
        } catch (InterruptedException unused) {
            C2622l.m5322V2(((sl2) this.f18969f).f19611f);
            if (this.f18976m) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e3) {
            Log.e("LoadTask", "Unexpected exception loading stream", e3);
            if (this.f18976m) {
                return;
            }
            obtainMessage(3, new tn2(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            if (this.f18976m) {
                return;
            }
            obtainMessage(3, new tn2(e4)).sendToTarget();
        }
    }
}

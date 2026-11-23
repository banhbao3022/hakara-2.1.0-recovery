package p007c.p190n.p385d.p418r;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.FirebaseApp2;

/* JADX INFO: renamed from: c.n.d.r.x */
/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC5498x implements Runnable {

    /* JADX INFO: renamed from: f */
    public final long f27109f;

    /* JADX INFO: renamed from: g */
    public final PowerManager.WakeLock f27110g;

    /* JADX INFO: renamed from: h */
    public final FirebaseInstanceId f27111h;

    /* JADX INFO: renamed from: i */
    public ExecutorService f27112i = C5482h.m12068a();

    /* JADX INFO: renamed from: c.n.d.r.x$a */
    /* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public RunnableC5498x f27113a;

        public a(RunnableC5498x runnableC5498x) {
            this.f27113a = runnableC5498x;
        }

        /* JADX INFO: renamed from: a */
        public void m12091a() {
            if (FirebaseInstanceId.m12916l()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f27113a.m12087a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC5498x runnableC5498x = this.f27113a;
            if (runnableC5498x != null && runnableC5498x.m12089c()) {
                if (FirebaseInstanceId.m12916l()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                RunnableC5498x runnableC5498x2 = this.f27113a;
                runnableC5498x2.f27111h.m12918d(runnableC5498x2, 0L);
                this.f27113a.m12087a().unregisterReceiver(this);
                this.f27113a = null;
            }
        }
    }

    public RunnableC5498x(FirebaseInstanceId firebaseInstanceId, long j2) {
        this.f27111h = firebaseInstanceId;
        this.f27109f = j2;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) m12087a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f27110g = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    /* JADX INFO: renamed from: a */
    public Context m12087a() {
        FirebaseApp2 firebaseApp2 = this.f27111h.f29278f;
        firebaseApp2.m11668a();
        return firebaseApp2.f26303d;
    }

    /* JADX INFO: renamed from: b */
    public final void m12088b(String str) {
        FirebaseApp2 firebaseApp2 = this.f27111h.f29278f;
        firebaseApp2.m11668a();
        if ("[DEFAULT]".equals(firebaseApp2.f26304e)) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                FirebaseApp2 firebaseApp3 = this.f27111h.f29278f;
                firebaseApp3.m11668a();
                String strValueOf = String.valueOf(firebaseApp3.f26304e);
                Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(strValueOf) : new String("Invoking onNewToken for app: "));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C5480f(m12087a(), this.f27112i).m12067b(intent);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m12089c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m12087a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: d */
    public boolean m12090d() throws IOException {
        C5497w.a aVarM12924j = this.f27111h.m12924j();
        boolean z = true;
        if (!this.f27111h.m12929p(aVarM12924j)) {
            return true;
        }
        try {
            String strM12917b = this.f27111h.m12917b();
            if (strM12917b == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (aVarM12924j == null || !strM12917b.equals(aVarM12924j.f27106c)) {
                m12088b(strM12917b);
            }
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                String message2 = e.getMessage();
                outline.m1573X(new StringBuilder(String.valueOf(message2).length() + 52), "Token retrieval failed: ", message2, ". Will retry token retrieval", "FirebaseInstanceId");
                return false;
            }
            if (e.getMessage() != null) {
                throw e;
            }
            Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (C5496v.m12078a().m12080c(m12087a())) {
            this.f27110g.acquire();
        }
        try {
            this.f27111h.m12926m(true);
            if (!this.f27111h.f29279g.m12076d()) {
                this.f27111h.m12926m(false);
                if (!C5496v.m12078a().m12080c(m12087a())) {
                }
            } else if (!C5496v.m12078a().m12079b(m12087a()) || m12089c()) {
                if (m12090d()) {
                    this.f27111h.m12926m(false);
                } else {
                    this.f27111h.m12928o(this.f27109f);
                }
                if (!C5496v.m12078a().m12080c(m12087a())) {
                }
            } else {
                new a(this).m12091a();
                if (!C5496v.m12078a().m12080c(m12087a())) {
                }
            }
        } catch (IOException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            Log.e("FirebaseInstanceId", sb.toString());
            this.f27111h.m12926m(false);
            if (!C5496v.m12078a().m12080c(m12087a())) {
            }
        } finally {
            if (C5496v.m12078a().m12080c(m12087a())) {
                this.f27110g.release();
            }
        }
    }
}

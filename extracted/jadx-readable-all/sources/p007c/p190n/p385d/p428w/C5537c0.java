package p007c.p190n.p385d.p428w;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p007c.p190n.p385d.p418r.C5488n;
import p007c.p190n.p385d.p418r.C5491q;
import p007c.p190n.p385d.p418r.InterfaceC5489o;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.n.d.w.c0 */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class C5537c0 {

    /* JADX INFO: renamed from: a */
    public static final long f27240a = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f27241b = 0;

    /* JADX INFO: renamed from: c */
    public final FirebaseInstanceId f27242c;

    /* JADX INFO: renamed from: d */
    public final Context f27243d;

    /* JADX INFO: renamed from: e */
    public final C5491q f27244e;

    /* JADX INFO: renamed from: f */
    public final C5488n f27245f;

    /* JADX INFO: renamed from: h */
    public final ScheduledExecutorService f27247h;

    /* JADX INFO: renamed from: j */
    public final C5533a0 f27249j;

    /* JADX INFO: renamed from: g */
    public final Map<String, ArrayDeque<C4782j<Void>>> f27246g = new ArrayMap();

    /* JADX INFO: renamed from: i */
    public boolean f27248i = false;

    public C5537c0(FirebaseInstanceId firebaseInstanceId, C5491q c5491q, C5533a0 c5533a0, C5488n c5488n, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f27242c = firebaseInstanceId;
        this.f27244e = c5491q;
        this.f27249j = c5533a0;
        this.f27245f = c5488n;
        this.f27243d = context;
        this.f27247h = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m12168a(AbstractC4781i<T> abstractC4781i) throws IOException {
        try {
            return (T) C4340s8.m10205b(abstractC4781i, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e2);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12169d() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* JADX INFO: renamed from: b */
    public final void m12170b(String str) throws IOException {
        InterfaceC5489o interfaceC5489o = (InterfaceC5489o) m12168a(this.f27242c.m12920f());
        C5488n c5488n = this.f27245f;
        String strMo12072w = interfaceC5489o.mo12072w();
        String strMo12071a = interfaceC5489o.mo12071a();
        Objects.requireNonNull(c5488n);
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        String strValueOf2 = String.valueOf(str);
        m12168a(c5488n.m12069a(c5488n.m12070b(strMo12072w, strMo12071a, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle)));
    }

    /* JADX INFO: renamed from: c */
    public final void m12171c(String str) throws IOException {
        InterfaceC5489o interfaceC5489o = (InterfaceC5489o) m12168a(this.f27242c.m12920f());
        C5488n c5488n = this.f27245f;
        String strMo12072w = interfaceC5489o.mo12072w();
        String strMo12071a = interfaceC5489o.mo12071a();
        Objects.requireNonNull(c5488n);
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String strValueOf2 = String.valueOf(str);
        m12168a(c5488n.m12069a(c5488n.m12070b(strMo12072w, strMo12071a, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle)));
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m12172e(boolean z) {
        this.f27248i = z;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX INFO: renamed from: f */
    public boolean m12173f() throws IOException {
        byte b;
        while (true) {
            synchronized (this) {
                C5561z c5561zM12166a = this.f27249j.m12166a();
                boolean z = true;
                if (c5561zM12166a == null) {
                    if (m12169d()) {
                        Log.d("FirebaseMessaging", "topic sync succeeded");
                    }
                    return true;
                }
                try {
                    String str = c5561zM12166a.f27302c;
                    int iHashCode = str.hashCode();
                    if (iHashCode != 83) {
                        if (iHashCode == 85 && str.equals("U")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals("S")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        m12170b(c5561zM12166a.f27301b);
                        if (m12169d()) {
                            String str2 = c5561zM12166a.f27301b;
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 31);
                            sb.append("Subscribe to topic: ");
                            sb.append(str2);
                            sb.append(" succeeded.");
                            Log.d("FirebaseMessaging", sb.toString());
                        }
                    } else if (b == 1) {
                        m12171c(c5561zM12166a.f27301b);
                        if (m12169d()) {
                            String str3 = c5561zM12166a.f27301b;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 35);
                            sb2.append("Unsubscribe from topic: ");
                            sb2.append(str3);
                            sb2.append(" succeeded.");
                            Log.d("FirebaseMessaging", sb2.toString());
                        }
                    } else if (m12169d()) {
                        String strValueOf = String.valueOf(c5561zM12166a);
                        StringBuilder sb3 = new StringBuilder(strValueOf.length() + 24);
                        sb3.append("Unknown topic operation");
                        sb3.append(strValueOf);
                        sb3.append(".");
                        Log.d("FirebaseMessaging", sb3.toString());
                    }
                } catch (IOException e) {
                    if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                        String message = e.getMessage();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + 53);
                        sb4.append("Topic operation failed: ");
                        sb4.append(message);
                        sb4.append(". Will retry Topic operation.");
                        Log.e("FirebaseMessaging", sb4.toString());
                    } else {
                        if (e.getMessage() != null) {
                            throw e;
                        }
                        Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    }
                    z = false;
                }
                if (!z) {
                    return false;
                }
                C5533a0 c5533a0 = this.f27249j;
                synchronized (c5533a0) {
                    final C5560y c5560y = c5533a0.f27229c;
                    String str4 = c5561zM12166a.f27303d;
                    synchronized (c5560y.f27298d) {
                        if (c5560y.f27298d.remove(str4)) {
                            c5560y.f27299e.execute(new Runnable(c5560y) { // from class: c.n.d.w.x

                                /* JADX INFO: renamed from: f */
                                public final C5560y f27294f;

                                {
                                    this.f27294f = c5560y;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    C5560y c5560y2 = this.f27294f;
                                    synchronized (c5560y2.f27298d) {
                                        SharedPreferences.Editor editorEdit = c5560y2.f27295a.edit();
                                        String str5 = c5560y2.f27296b;
                                        StringBuilder sb5 = new StringBuilder();
                                        Iterator<String> it = c5560y2.f27298d.iterator();
                                        while (it.hasNext()) {
                                            sb5.append(it.next());
                                            sb5.append(c5560y2.f27297c);
                                        }
                                        editorEdit.putString(str5, sb5.toString()).commit();
                                    }
                                }
                            });
                        }
                    }
                }
                synchronized (this.f27246g) {
                    String str5 = c5561zM12166a.f27303d;
                    if (this.f27246g.containsKey(str5)) {
                        ArrayDeque<C4782j<Void>> arrayDeque = this.f27246g.get(str5);
                        C4782j<Void> c4782jPoll = arrayDeque.poll();
                        if (c4782jPoll != null) {
                            c4782jPoll.f24683a.m10944q(null);
                        }
                        if (arrayDeque.isEmpty()) {
                            this.f27246g.remove(str5);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m12174g(long j2) {
        this.f27247h.schedule(new RunnableC5539d0(this, this.f27243d, this.f27244e, Math.min(Math.max(30L, j2 + j2), f27240a)), j2, TimeUnit.SECONDS);
        m12172e(true);
    }
}

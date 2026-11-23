package p007c.p190n.p194b.p266d.p267a.p280x;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p298f.C2610f;
import p007c.p190n.p194b.p266d.p298f.C2612g;
import p007c.p190n.p194b.p266d.p298f.C2614h;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.ServiceConnectionC2600a;
import p007c.p190n.p194b.p266d.p298f.p306t.C2778a;
import p007c.p190n.p194b.p266d.p314j.p316b.AbstractBinderC3791c;
import p007c.p190n.p194b.p266d.p314j.p316b.C3792d;
import p007c.p190n.p194b.p266d.p314j.p316b.InterfaceC3790b;

/* JADX INFO: renamed from: c.n.b.d.a.x.a */
/* JADX INFO: loaded from: classes.dex */
public class C2211a {

    /* JADX INFO: renamed from: a */
    public ServiceConnectionC2600a f10616a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3790b f10617b;

    /* JADX INFO: renamed from: c */
    public boolean f10618c;

    /* JADX INFO: renamed from: d */
    public final Object f10619d;

    /* JADX INFO: renamed from: e */
    public b f10620e;

    /* JADX INFO: renamed from: f */
    public final Context f10621f;

    /* JADX INFO: renamed from: g */
    public final boolean f10622g;

    /* JADX INFO: renamed from: h */
    public final long f10623h;

    /* JADX INFO: renamed from: c.n.b.d.a.x.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f10624a;

        /* JADX INFO: renamed from: b */
        public final boolean f10625b;

        public a(String str, boolean z) {
            this.f10624a = str;
            this.f10625b = z;
        }

        public final String toString() {
            String str = this.f10624a;
            boolean z = this.f10625b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.a.x.a$b */
    public static class b extends Thread {

        /* JADX INFO: renamed from: f */
        public WeakReference<C2211a> f10626f;

        /* JADX INFO: renamed from: g */
        public long f10627g;

        /* JADX INFO: renamed from: h */
        public CountDownLatch f10628h = new CountDownLatch(1);

        /* JADX INFO: renamed from: i */
        public boolean f10629i = false;

        public b(C2211a c2211a, long j2) {
            this.f10626f = new WeakReference<>(c2211a);
            this.f10627g = j2;
            start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            C2211a c2211a;
            try {
                if (this.f10628h.await(this.f10627g, TimeUnit.MILLISECONDS) || (c2211a = this.f10626f.get()) == null) {
                    return;
                }
                c2211a.m4660a();
                this.f10629i = true;
            } catch (InterruptedException unused) {
                C2211a c2211a2 = this.f10626f.get();
                if (c2211a2 != null) {
                    c2211a2.m4660a();
                    this.f10629i = true;
                }
            }
        }
    }

    public C2211a(Context context) {
        this(context, 30000L, false, false);
    }

    public C2211a(Context context, long j2, boolean z, boolean z2) {
        Context applicationContext;
        this.f10619d = new Object();
        Objects.requireNonNull(context, "null reference");
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f10621f = context;
        this.f10618c = false;
        this.f10623h = j2;
        this.f10622g = z2;
    }

    /* JADX INFO: renamed from: b */
    public static a m4656b(Context context) throws IllegalStateException, C2612g, C2614h, IOException {
        float f;
        String string;
        C2213c c2213c = new C2213c(context);
        boolean zM4666a = c2213c.m4666a("gads:ad_id_app_context:enabled");
        try {
            SharedPreferences sharedPreferences = c2213c.f10631a;
            f = sharedPreferences == null ? 0.0f : sharedPreferences.getFloat("gads:ad_id_app_context:ping_ratio", 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
        }
        try {
            SharedPreferences sharedPreferences2 = c2213c.f10631a;
            string = sharedPreferences2 == null ? "" : sharedPreferences2.getString("gads:ad_id_use_shared_preference:experiment_id", "");
        } catch (Throwable th2) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th2);
        }
        C2211a c2211a = new C2211a(context, -1L, zM4666a, c2213c.m4666a("gads:ad_id_use_persistent_service:enabled"));
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c2211a.m4663h(false);
            a aVarM4661c = c2211a.m4661c();
            c2211a.m4664i(aVarM4661c, zM4666a, f, SystemClock.elapsedRealtime() - jElapsedRealtime, string, null);
            c2211a.m4660a();
            return aVarM4661c;
        } catch (Throwable th3) {
            try {
                c2211a.m4664i(null, zM4666a, f, -1L, string, th3);
                throw th3;
            } catch (Throwable th4) {
                c2211a.m4660a();
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m4657d(Context context) throws C2612g, C2614h, IOException {
        C2213c c2213c = new C2213c(context);
        C2211a c2211a = new C2211a(context, -1L, c2213c.m4666a("gads:ad_id_app_context:enabled"), c2213c.m4666a("com.google.android.gms.ads.identifier.service.PERSISTENT_START"));
        try {
            c2211a.m4663h(false);
            return c2211a.m4665j();
        } finally {
            c2211a.m4660a();
        }
    }

    /* JADX INFO: renamed from: e */
    public static ServiceConnectionC2600a m4658e(Context context, boolean z) throws C2612g, C2614h, IOException {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int iMo5207d = C2610f.f11568b.mo5207d(context, 12451000);
            if (iMo5207d != 0 && iMo5207d != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            ServiceConnectionC2600a serviceConnectionC2600a = new ServiceConnectionC2600a();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (C2778a.m5615b().m5616a(context, intent, serviceConnectionC2600a, 1)) {
                    return serviceConnectionC2600a;
                }
                throw new IOException("Connection failure");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C2612g(9);
        }
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC3790b m4659f(ServiceConnectionC2600a serviceConnectionC2600a) throws IOException {
        try {
            IBinder iBinderM5193a = serviceConnectionC2600a.m5193a(10000L, TimeUnit.MILLISECONDS);
            int i = AbstractBinderC3791c.f22460f;
            IInterface iInterfaceQueryLocalInterface = iBinderM5193a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3790b ? (InterfaceC3790b) iInterfaceQueryLocalInterface : new C3792d(iBinderM5193a);
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4660a() {
        C2622l.m5369g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f10621f == null || this.f10616a == null) {
                return;
            }
            try {
                if (this.f10618c) {
                    C2778a.m5615b().m5617c(this.f10621f, this.f10616a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.f10618c = false;
            this.f10617b = null;
            this.f10616a = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public a m4661c() throws IOException {
        a aVar;
        C2622l.m5369g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f10618c) {
                Objects.requireNonNull(this.f10616a, "null reference");
                Objects.requireNonNull(this.f10617b, "null reference");
                aVar = new a(this.f10617b.mo8917w(), this.f10617b.mo8915D2(true));
            } else {
                synchronized (this.f10619d) {
                    b bVar = this.f10620e;
                    if (bVar == null || !bVar.f10629i) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m4663h(false);
                    if (!this.f10618c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    Objects.requireNonNull(this.f10616a, "null reference");
                    Objects.requireNonNull(this.f10617b, "null reference");
                    try {
                        aVar = new a(this.f10617b.mo8917w(), this.f10617b.mo8915D2(true));
                    } catch (RemoteException e) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            throw th;
        }
        m4662g();
        return aVar;
    }

    public void finalize() throws Throwable {
        m4660a();
        super.finalize();
    }

    /* JADX INFO: renamed from: g */
    public final void m4662g() {
        synchronized (this.f10619d) {
            b bVar = this.f10620e;
            if (bVar != null) {
                bVar.f10628h.countDown();
                try {
                    this.f10620e.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f10623h > 0) {
                this.f10620e = new b(this, this.f10623h);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4663h(boolean z) throws IllegalStateException, C2612g, C2614h, IOException {
        C2622l.m5369g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f10618c) {
                m4660a();
            }
            ServiceConnectionC2600a serviceConnectionC2600aM4658e = m4658e(this.f10621f, this.f10622g);
            this.f10616a = serviceConnectionC2600aM4658e;
            this.f10617b = m4659f(serviceConnectionC2600aM4658e);
            this.f10618c = true;
            if (z) {
                m4662g();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4664i(a aVar, boolean z, float f, long j2, String str, Throwable th) {
        String str2;
        if (Math.random() > f) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", z ? "1" : "0");
        if (aVar != null) {
            map.put("limit_ad_tracking", aVar.f10625b ? "1" : "0");
        }
        if (aVar != null && (str2 = aVar.f10624a) != null) {
            map.put("ad_id_size", Integer.toString(str2.length()));
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            map.put("experiment_id", str);
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j2));
        new C2212b(map).start();
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4665j() throws IOException {
        boolean zMo8916b;
        C2622l.m5369g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f10618c) {
                Objects.requireNonNull(this.f10616a, "null reference");
                Objects.requireNonNull(this.f10617b, "null reference");
                zMo8916b = this.f10617b.mo8916b();
            } else {
                synchronized (this.f10619d) {
                    b bVar = this.f10620e;
                    if (bVar == null || !bVar.f10629i) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m4663h(false);
                    if (!this.f10618c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    Objects.requireNonNull(this.f10616a, "null reference");
                    Objects.requireNonNull(this.f10617b, "null reference");
                    try {
                        zMo8916b = this.f10617b.mo8916b();
                    } catch (RemoteException e) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            throw th;
        }
        m4662g();
        return zMo8916b;
    }
}

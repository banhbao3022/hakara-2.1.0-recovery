package p636z0.p767w.p768a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: z0.w.a.t, reason: use source file name */
/* JADX INFO: compiled from: RegisteredMediaRouteProviderWatcher.java */
/* JADX INFO: loaded from: classes.dex */
public final class RegisteredMediaRouteProviderWatcher {

    /* JADX INFO: renamed from: a */
    public final Context f38929a;

    /* JADX INFO: renamed from: b */
    public final c f38930b;

    /* JADX INFO: renamed from: d */
    public final PackageManager f38932d;

    /* JADX INFO: renamed from: f */
    public boolean f38934f;

    /* JADX INFO: renamed from: e */
    public final ArrayList<RegisteredMediaRouteProvider2> f38933e = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public final BroadcastReceiver f38935g = new a();

    /* JADX INFO: renamed from: h */
    public final Runnable f38936h = new b();

    /* JADX INFO: renamed from: c */
    public final Handler f38931c = new Handler();

    /* JADX INFO: renamed from: z0.w.a.t$a */
    /* JADX INFO: compiled from: RegisteredMediaRouteProviderWatcher.java */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RegisteredMediaRouteProviderWatcher.this.m16868a();
        }
    }

    /* JADX INFO: renamed from: z0.w.a.t$b */
    /* JADX INFO: compiled from: RegisteredMediaRouteProviderWatcher.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RegisteredMediaRouteProviderWatcher.this.m16868a();
        }
    }

    /* JADX INFO: renamed from: z0.w.a.t$c */
    /* JADX INFO: compiled from: RegisteredMediaRouteProviderWatcher.java */
    public interface c {
    }

    public RegisteredMediaRouteProviderWatcher(Context context, c cVar) {
        this.f38929a = context;
        this.f38930b = cVar;
        this.f38932d = context.getPackageManager();
    }

    /* JADX INFO: renamed from: a */
    public void m16868a() {
        if (this.f38934f) {
            Iterator<ResolveInfo> it = this.f38932d.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i = 0;
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size = this.f38933e.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            i2 = -1;
                            break;
                        }
                        RegisteredMediaRouteProvider2 registeredMediaRouteProvider2 = this.f38933e.get(i2);
                        if (registeredMediaRouteProvider2.f38903j.getPackageName().equals(str) && registeredMediaRouteProvider2.f38903j.getClassName().equals(str2)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 < 0) {
                        RegisteredMediaRouteProvider2 registeredMediaRouteProvider3 = new RegisteredMediaRouteProvider2(this.f38929a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        registeredMediaRouteProvider3.m16859v();
                        this.f38933e.add(i, registeredMediaRouteProvider3);
                        ((MediaRouter.d) this.f38930b).m16817a(registeredMediaRouteProvider3);
                        i++;
                    } else if (i2 >= i) {
                        RegisteredMediaRouteProvider2 registeredMediaRouteProvider4 = this.f38933e.get(i2);
                        registeredMediaRouteProvider4.m16859v();
                        if (registeredMediaRouteProvider4.f38908o == null && registeredMediaRouteProvider4.m16858u()) {
                            registeredMediaRouteProvider4.m16860w();
                            registeredMediaRouteProvider4.m16854q();
                        }
                        Collections.swap(this.f38933e, i2, i);
                        i++;
                    }
                }
            }
            if (i < this.f38933e.size()) {
                for (int size2 = this.f38933e.size() - 1; size2 >= i; size2--) {
                    RegisteredMediaRouteProvider2 registeredMediaRouteProvider5 = this.f38933e.get(size2);
                    MediaRouter.d dVar = (MediaRouter.d) this.f38930b;
                    int iM16818b = dVar.m16818b(registeredMediaRouteProvider5);
                    if (iM16818b >= 0) {
                        Objects.requireNonNull(registeredMediaRouteProvider5);
                        MediaRouter.m16813a();
                        registeredMediaRouteProvider5.f38815d = null;
                        registeredMediaRouteProvider5.m16797p(null);
                        MediaRouter.e eVar = dVar.f38842e.get(iM16818b);
                        dVar.m16827k(eVar, null);
                        if (MediaRouter.f38830a) {
                            Log.d("MediaRouter", "Provider removed: " + eVar);
                        }
                        dVar.f38846i.m16831b(514, eVar);
                        dVar.f38842e.remove(iM16818b);
                    }
                    this.f38933e.remove(registeredMediaRouteProvider5);
                    if (registeredMediaRouteProvider5.f38906m) {
                        if (RegisteredMediaRouteProvider2.f38902i) {
                            Log.d("MediaRouteProviderProxy", registeredMediaRouteProvider5 + ": Stopping");
                        }
                        registeredMediaRouteProvider5.f38906m = false;
                        registeredMediaRouteProvider5.m16861x();
                    }
                }
            }
        }
    }
}

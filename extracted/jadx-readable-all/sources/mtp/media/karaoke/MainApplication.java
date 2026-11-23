package mtp.media.karaoke;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.RemoteException;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p007c.p008a.p009a.p010a.ExoMedia;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p267a.C2191r;
import p007c.p190n.p194b.p266d.p267a.p281y.InterfaceC2215a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p314j.p315a.BinderC3247ld;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3099hd;
import p007c.p190n.p194b.p266d.p314j.p315a.C3125i2;
import p007c.p190n.p194b.p266d.p314j.p315a.C3494s1;
import p477d1.Lazy3;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p483s.CollectionsJVM;
import p477d1.p483s.Iterables2;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p526i1.p536d.p537a.p539b.p540a.KoinExt2;
import p526i1.p536d.p537a.p539b.p540a.KoinExt4;
import p526i1.p536d.p543c.KoinApplication;
import p526i1.p536d.p543c.KoinApplication2;
import p526i1.p536d.p543c.KoinApplication3;
import p526i1.p536d.p543c.KoinApplication4;
import p526i1.p536d.p543c.p544g.GlobalContext;
import p526i1.p536d.p543c.p544g.KoinContext;
import p526i1.p536d.p543c.p544g.KoinContextHandler;
import p526i1.p536d.p543c.p548k.Logger6;
import p526i1.p536d.p543c.p548k.Logger7;
import p526i1.p536d.p543c.p549l.Module;
import p526i1.p536d.p543c.p551n.StringQualifier;
import p526i1.p536d.p543c.p552o.ScopeRegistry;
import p526i1.p536d.p543c.p553p.ScopeDefinition;
import p555j.p556a.p557a.MainApplication2;
import p555j.p556a.p557a.p558a.p596f.PlaylistManager;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p617j.AppModule2;
import p636z0.p769x.MultiDex;

/* JADX INFO: compiled from: MainApplication.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MainApplication extends Application {

    /* JADX INFO: renamed from: f */
    public final Lazy3 f33388f = LazyJVM.m13021b(new C7234b());

    /* JADX INFO: renamed from: mtp.media.karaoke.MainApplication$a */
    /* JADX INFO: compiled from: MainApplication.kt */
    public static final class C7233a extends Lambda implements InterfaceC6164l<KoinApplication, Unit> {
        public C7233a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(KoinApplication koinApplication) {
            KoinApplication koinApplication2 = koinApplication;
            Intrinsics2.m13089e(koinApplication2, "$receiver");
            MainApplication mainApplication = MainApplication.this;
            Intrinsics2.m13090f(koinApplication2, "$this$androidContext");
            Intrinsics2.m13090f(mainApplication, "androidContext");
            Logger7 logger7 = koinApplication2.f30890b.f30887b;
            Logger6 logger6 = Logger6.INFO;
            if (logger7.m13854e(logger6)) {
                koinApplication2.f30890b.f30887b.m13853d("[init] declare Android Context");
            }
            int iIntValue = 0;
            koinApplication2.f30890b.m13843b(CollectionsJVM.m13036a(SkuDao.a.m14059K(false, false, new KoinExt2(mainApplication), 3)));
            koinApplication2.f30890b.m13843b(CollectionsJVM.m13036a(SkuDao.a.m14059K(false, false, new KoinExt4(mainApplication), 3)));
            List<Module> list = AppModule2.f33016b;
            Intrinsics2.m13090f(list, "modules");
            if (koinApplication2.f30890b.f30887b.m13854e(logger6)) {
                double dM14057I = SkuDao.a.m14057I(new KoinApplication3(koinApplication2, list));
                Collection<ScopeDefinition> collectionValues = koinApplication2.f30890b.f30886a.f30937a.values();
                ArrayList arrayList = new ArrayList(Iterables2.m13042g(collectionValues, 10));
                Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((ScopeDefinition) it.next()).f30957e.size()));
                }
                Intrinsics2.m13089e(arrayList, "$this$sum");
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    iIntValue += ((Number) it2.next()).intValue();
                }
                koinApplication2.f30890b.f30887b.m13853d("loaded " + iIntValue + " definitions - " + dM14057I + " ms");
            } else {
                koinApplication2.f30890b.m13843b(list);
            }
            if (koinApplication2.f30890b.f30887b.m13854e(logger6)) {
                double dM14057I2 = SkuDao.a.m14057I(new KoinApplication4(koinApplication2));
                koinApplication2.f30890b.f30887b.m13853d("create context - " + dM14057I2 + " ms");
            } else {
                koinApplication2.f30890b.f30886a.m13858a();
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.MainApplication$b */
    /* JADX INFO: compiled from: MainApplication.kt */
    public static final class C7234b extends Lambda implements InterfaceC6153a<PlaylistManager> {
        public C7234b() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public PlaylistManager mo2c() {
            return new PlaylistManager(MainApplication.this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final PlaylistManager m14331a() {
        return (PlaylistManager) this.f33388f.getValue();
    }

    @Override // android.app.Application
    public void onCreate() {
        ApplicationInfo applicationInfo;
        super.onCreate();
        Set<File> set = MultiDex.f38973a;
        Log.i("MultiDex", "Installing application");
        try {
            if (MultiDex.f38974b) {
                Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            } else {
                try {
                    applicationInfo = getApplicationInfo();
                } catch (RuntimeException e) {
                    Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
                    applicationInfo = null;
                }
                if (applicationInfo == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                } else {
                    MultiDex.m16891c(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir), "secondary-dexes", "", true);
                    Log.i("MultiDex", "install done");
                }
            }
            Intrinsics2.m13089e(this, "application");
            SharedPreferences sharedPreferences = getSharedPreferences("mpt.media.karaoke.PREFERENCES", 0);
            Intrinsics2.m13088d(sharedPreferences, "application.getSharedPre…xt.MODE_PRIVATE\n        )");
            ModelPrefs.f32358a = sharedPreferences;
            final C3494s1 c3494s1M8336a = C3494s1.m8336a();
            synchronized (c3494s1M8336a.f19436c) {
                if (!c3494s1M8336a.f19438e) {
                    if (!c3494s1M8336a.f19439f) {
                        c3494s1M8336a.f19438e = true;
                        try {
                            if (C3099hd.f14812a == null) {
                                C3099hd.f14812a = new C3099hd();
                            }
                            C3099hd.f14812a.m7115a(this, null);
                            c3494s1M8336a.m8338c(this);
                            c3494s1M8336a.f19437d.mo6542Y3(new BinderC3247ld());
                            c3494s1M8336a.f19437d.mo6545c();
                            c3494s1M8336a.f19437d.mo6546g2(null, new BinderC2800b(null));
                            C2191r c2191r = c3494s1M8336a.f19440g;
                            if (c2191r.f10582b != -1 || c2191r.f10583c != -1) {
                                try {
                                    c3494s1M8336a.f19437d.mo6540T2(new C3125i2(c2191r));
                                } catch (RemoteException e2) {
                                    C2622l.m5438t3("Unable to set request configuration parcel.", e2);
                                }
                            }
                            C3052g3.m6922a(this);
                            if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14328c3)).booleanValue() && !c3494s1M8336a.m8337b().endsWith("0")) {
                                C2622l.m5408n3("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                                c3494s1M8336a.f19441h = new InterfaceC2215a(c3494s1M8336a) { // from class: c.n.b.d.j.a.r1
                                };
                            }
                        } catch (RemoteException e3) {
                            C2622l.m5241D3("MobileAdsSettingManager initialization failed", e3);
                        }
                    }
                }
            }
            C7233a c7233a = new C7233a();
            GlobalContext globalContext = new GlobalContext();
            Intrinsics2.m13090f(globalContext, "koinContext");
            Intrinsics2.m13090f(c7233a, "appDeclaration");
            KoinContextHandler koinContextHandler = KoinContextHandler.f30897b;
            Intrinsics2.m13090f(globalContext, "koinContext");
            synchronized (koinContextHandler) {
                if (KoinContextHandler.f30896a != null) {
                    throw new IllegalStateException("A KoinContext is already started".toString());
                }
                KoinContextHandler.f30896a = globalContext;
            }
            Objects.requireNonNull(KoinApplication.f30889a);
            KoinApplication koinApplication = new KoinApplication(null);
            ScopeRegistry scopeRegistry = koinApplication.f30890b.f30886a;
            Objects.requireNonNull(scopeRegistry);
            Objects.requireNonNull(ScopeDefinition.f30954b);
            StringQualifier stringQualifier = ScopeDefinition.f30953a;
            scopeRegistry.f30937a.put(stringQualifier.f30933a, new ScopeDefinition(stringQualifier, true, null, 4, null));
            Intrinsics2.m13090f(koinApplication, "koinApplication");
            KoinContext koinContext = KoinContextHandler.f30896a;
            if (koinContext == null) {
                throw new IllegalStateException("No Koin Context configured. Please use startKoin or koinApplication DSL. ".toString());
            }
            koinContext.mo13845a(koinApplication);
            c7233a.mo3b(koinApplication);
            if (koinApplication.f30890b.f30887b.m13854e(Logger6.DEBUG)) {
                double dM14057I = SkuDao.a.m14057I(new KoinApplication2(koinApplication));
                koinApplication.f30890b.f30887b.m13850a("instances started in " + dM14057I + " ms");
            } else {
                koinApplication.f30890b.m13842a();
            }
            MainApplication2 mainApplication2 = new MainApplication2(this);
            ExoMedia exoMedia = ExoMedia.f1497e;
            ExoMedia.f1495c = mainApplication2;
        } catch (Exception e4) {
            Log.e("MultiDex", "MultiDex installation failure", e4);
            StringBuilder sbM1556G = outline.m1556G("MultiDex installation failed (");
            sbM1556G.append(e4.getMessage());
            sbM1556G.append(").");
            throw new RuntimeException(sbM1556G.toString());
        }
    }
}

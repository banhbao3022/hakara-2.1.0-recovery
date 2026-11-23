package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p386j.p387a.InterfaceC5229a;
import p007c.p190n.p385d.p390k.Component3;
import p007c.p190n.p385d.p390k.ComponentContainer;
import p007c.p190n.p385d.p390k.ComponentFactory;
import p007c.p190n.p385d.p390k.ComponentRegistrar;
import p007c.p190n.p385d.p390k.Dependency;
import p007c.p190n.p385d.p391l.FirebaseCrashlytics2;
import p007c.p190n.p385d.p391l.p392e.CrashlyticsNativeComponent;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.MissingNativeComponent;
import p007c.p190n.p385d.p391l.p392e.Onboarding3;
import p007c.p190n.p385d.p391l.p392e.Onboarding4;
import p007c.p190n.p385d.p391l.p392e.p393i.AnalyticsEventLogger;
import p007c.p190n.p385d.p391l.p392e.p393i.BlockingAnalyticsEventLogger;
import p007c.p190n.p385d.p391l.p392e.p393i.BreadcrumbAnalyticsEventReceiver;
import p007c.p190n.p385d.p391l.p392e.p393i.CrashlyticsOriginAnalyticsEventLogger;
import p007c.p190n.p385d.p391l.p392e.p393i.UnavailableAnalyticsEventLogger;
import p007c.p190n.p385d.p391l.p392e.p394j.BreadcrumbSource;
import p007c.p190n.p385d.p391l.p392e.p394j.DisabledBreadcrumbSource;
import p007c.p190n.p385d.p391l.p392e.p395k.AppData;
import p007c.p190n.p385d.p391l.p392e.p395k.C5335t;
import p007c.p190n.p385d.p391l.p392e.p395k.C5343x;
import p007c.p190n.p385d.p391l.p392e.p395k.CallableC5323n;
import p007c.p190n.p385d.p391l.p392e.p395k.CommonUtils;
import p007c.p190n.p385d.p391l.p392e.p395k.CrashlyticsCore3;
import p007c.p190n.p385d.p391l.p392e.p395k.CrashlyticsCore4;
import p007c.p190n.p385d.p391l.p392e.p395k.CrashlyticsFileMarker;
import p007c.p190n.p385d.p391l.p392e.p395k.CrashlyticsUncaughtExceptionHandler;
import p007c.p190n.p385d.p391l.p392e.p395k.DataCollectionArbiter;
import p007c.p190n.p385d.p391l.p392e.p395k.IdManager;
import p007c.p190n.p385d.p391l.p392e.p395k.SystemCurrentTimeProvider;
import p007c.p190n.p385d.p391l.p392e.p395k.Utils3;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpRequestFactory;
import p007c.p190n.p385d.p391l.p392e.p400o.FileStoreImpl;
import p007c.p190n.p385d.p391l.p392e.p406s.CachedSettingsIo;
import p007c.p190n.p385d.p391l.p392e.p406s.SettingsController;
import p007c.p190n.p385d.p391l.p392e.p406s.SettingsJsonParser;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.SettingsRequest;
import p007c.p190n.p385d.p391l.p392e.p406s.p408i.DefaultSettingsSpiCall;
import p007c.p190n.p385d.p391l.p392e.p410u.ResourceUnityVersionProvider;
import p007c.p190n.p385d.p421t.FirebaseInstallationsApi;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    @Override // p007c.p190n.p385d.p390k.ComponentRegistrar
    public List<Component3<?>> getComponents() {
        Component3.b bVarM11686a = Component3.m11686a(FirebaseCrashlytics2.class);
        bVarM11686a.m11689a(new Dependency(FirebaseApp2.class, 1, 0));
        bVarM11686a.m11689a(new Dependency(FirebaseInstallationsApi.class, 1, 0));
        bVarM11686a.m11689a(new Dependency(InterfaceC5229a.class, 0, 0));
        bVarM11686a.m11689a(new Dependency(CrashlyticsNativeComponent.class, 0, 0));
        bVarM11686a.m11691c(new ComponentFactory(this) { // from class: c.n.d.l.b

            /* JADX INFO: renamed from: a */
            public final CrashlyticsRegistrar f26415a;

            {
                this.f26415a = this;
            }

            /* JADX WARN: Code duplicated, block: B:39:0x0270  */
            /* JADX WARN: Code duplicated, block: B:42:0x0281 A[Catch: Exception -> 0x0379, TryCatch #2 {Exception -> 0x0379, blocks: (B:40:0x0279, B:42:0x0281, B:43:0x0287, B:47:0x02cf, B:49:0x0335, B:50:0x033a, B:52:0x035b, B:54:0x0363), top: B:72:0x0279 }] */
            /* JADX WARN: Code duplicated, block: B:45:0x02cb  */
            /* JADX WARN: Code duplicated, block: B:46:0x02ce  */
            /* JADX WARN: Code duplicated, block: B:65:0x03a6  */
            @Override // p007c.p190n.p385d.p390k.ComponentFactory
            /* JADX INFO: renamed from: a */
            public Object mo11679a(ComponentContainer componentContainer) {
                BreadcrumbSource disabledBreadcrumbSource;
                AnalyticsEventLogger unavailableAnalyticsEventLogger;
                boolean z;
                boolean z2;
                boolean z3;
                String str;
                String str2;
                boolean zExists;
                AnalyticsEventLogger analyticsEventLogger;
                BreadcrumbSource disabledBreadcrumbSource2;
                Objects.requireNonNull(this.f26415a);
                FirebaseApp2 firebaseApp2 = (FirebaseApp2) componentContainer.mo11684a(FirebaseApp2.class);
                CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) componentContainer.mo11684a(CrashlyticsNativeComponent.class);
                InterfaceC5229a interfaceC5229a = (InterfaceC5229a) componentContainer.mo11684a(InterfaceC5229a.class);
                FirebaseInstallationsApi firebaseInstallationsApi = (FirebaseInstallationsApi) componentContainer.mo11684a(FirebaseInstallationsApi.class);
                firebaseApp2.m11668a();
                Context context = firebaseApp2.f26303d;
                IdManager idManager = new IdManager(context, context.getPackageName(), firebaseInstallationsApi);
                DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp2);
                CrashlyticsNativeComponent missingNativeComponent = crashlyticsNativeComponent == null ? new MissingNativeComponent() : crashlyticsNativeComponent;
                Onboarding4 onboarding4 = new Onboarding4(firebaseApp2, context, idManager, dataCollectionArbiter);
                if (interfaceC5229a != null) {
                    Logger4 logger4 = Logger4.f26421a;
                    logger4.m11713b("Firebase Analytics is available.");
                    CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(interfaceC5229a);
                    CrashlyticsAnalyticsListener crashlyticsAnalyticsListener = new CrashlyticsAnalyticsListener();
                    InterfaceC5229a.a aVarMo11678c = interfaceC5229a.mo11678c("clx", crashlyticsAnalyticsListener);
                    if (aVarMo11678c == null) {
                        logger4.m11713b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
                        aVarMo11678c = interfaceC5229a.mo11678c("crash", crashlyticsAnalyticsListener);
                        if (aVarMo11678c != null) {
                            logger4.m11717f("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
                        }
                    }
                    if (aVarMo11678c != null) {
                        logger4.m11713b("Firebase Analytics listener registered successfully.");
                        BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
                        BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger, HttpStatus.HTTP_INTERNAL_SERVER_ERROR, TimeUnit.MILLISECONDS);
                        crashlyticsAnalyticsListener.f26414b = breadcrumbAnalyticsEventReceiver;
                        crashlyticsAnalyticsListener.f26413a = blockingAnalyticsEventLogger;
                        analyticsEventLogger = blockingAnalyticsEventLogger;
                        disabledBreadcrumbSource2 = breadcrumbAnalyticsEventReceiver;
                    } else {
                        logger4.m11713b("Firebase Analytics listener registration failed.");
                        disabledBreadcrumbSource2 = new DisabledBreadcrumbSource();
                        analyticsEventLogger = crashlyticsOriginAnalyticsEventLogger;
                    }
                    disabledBreadcrumbSource = disabledBreadcrumbSource2;
                    unavailableAnalyticsEventLogger = analyticsEventLogger;
                } else {
                    Logger4.f26421a.m11713b("Firebase Analytics is unavailable.");
                    disabledBreadcrumbSource = new DisabledBreadcrumbSource();
                    unavailableAnalyticsEventLogger = new UnavailableAnalyticsEventLogger();
                }
                CrashlyticsCore3 crashlyticsCore3 = new CrashlyticsCore3(firebaseApp2, idManager, missingNativeComponent, dataCollectionArbiter, disabledBreadcrumbSource, unavailableAnalyticsEventLogger, C4799a.m10984e("Crashlytics Exception Handler"));
                try {
                    onboarding4.f26438i = onboarding4.f26441l.m11776c();
                    onboarding4.f26433d = onboarding4.f26432c.getPackageManager();
                    String packageName = onboarding4.f26432c.getPackageName();
                    onboarding4.f26434e = packageName;
                    PackageInfo packageInfo = onboarding4.f26433d.getPackageInfo(packageName, 0);
                    onboarding4.f26435f = packageInfo;
                    onboarding4.f26436g = Integer.toString(packageInfo.versionCode);
                    String str3 = onboarding4.f26435f.versionName;
                    if (str3 == null) {
                        str3 = "0.0";
                    }
                    onboarding4.f26437h = str3;
                    onboarding4.f26439j = onboarding4.f26433d.getApplicationLabel(onboarding4.f26432c.getApplicationInfo()).toString();
                    onboarding4.f26440k = Integer.toString(onboarding4.f26432c.getApplicationInfo().targetSdkVersion);
                    z = true;
                } catch (PackageManager.NameNotFoundException e) {
                    Logger4 logger5 = Logger4.f26421a;
                    if (logger5.m11712a(6)) {
                        Log.e(logger5.f26422b, "Failed init", e);
                    }
                    z = false;
                }
                if (!z) {
                    Logger4.f26421a.m11715d("Unable to start Crashlytics.");
                    return null;
                }
                ExecutorService executorServiceM10984e = C4799a.m10984e("com.google.firebase.crashlytics.startup");
                firebaseApp2.m11668a();
                String str4 = firebaseApp2.f26305f.f26320b;
                IdManager idManager2 = onboarding4.f26441l;
                HttpRequestFactory httpRequestFactory = onboarding4.f26430a;
                String str5 = onboarding4.f26436g;
                String str6 = onboarding4.f26437h;
                String strM11720c = onboarding4.m11720c();
                DataCollectionArbiter dataCollectionArbiter2 = onboarding4.f26442m;
                String strM11776c = idManager2.m11776c();
                SystemCurrentTimeProvider systemCurrentTimeProvider = new SystemCurrentTimeProvider();
                SettingsJsonParser settingsJsonParser = new SettingsJsonParser(systemCurrentTimeProvider);
                CachedSettingsIo cachedSettingsIo = new CachedSettingsIo(context);
                Locale locale = Locale.US;
                SettingsController settingsController = new SettingsController(context, new SettingsRequest(str4, String.format(locale, "%s/%s", idManager2.m11778e(Build.MANUFACTURER), idManager2.m11778e(Build.MODEL)), idManager2.m11778e(Build.VERSION.INCREMENTAL), idManager2.m11778e(Build.VERSION.RELEASE), idManager2, CommonUtils.m11742e(CommonUtils.m11748k(context), str4, str6, str5), str6, str5, C7804v0.m15333v(C7804v0.m15321j(strM11776c))), systemCurrentTimeProvider, settingsJsonParser, cachedSettingsIo, new DefaultSettingsSpiCall(strM11720c, String.format(locale, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str4), httpRequestFactory), dataCollectionArbiter2);
                settingsController.m12033d(1, executorServiceM10984e).mo10934g(executorServiceM10984e, new Onboarding3(onboarding4));
                String strM11748k = CommonUtils.m11748k(crashlyticsCore3.f26500a);
                Logger4 logger6 = Logger4.f26421a;
                outline.m1566Q("Mapping file ID is: ", strM11748k, logger6);
                if (CommonUtils.m11746i(crashlyticsCore3.f26500a, "com.crashlytics.RequireBuildId", true)) {
                    if (CommonUtils.m11755r(strM11748k)) {
                        Log.e("FirebaseCrashlytics", ".");
                        Log.e("FirebaseCrashlytics", ".     |  | ");
                        Log.e("FirebaseCrashlytics", ".     |  |");
                        Log.e("FirebaseCrashlytics", ".     |  |");
                        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                        Log.e("FirebaseCrashlytics", ".    \\    /");
                        Log.e("FirebaseCrashlytics", ".     \\  /");
                        Log.e("FirebaseCrashlytics", ".      \\/");
                        Log.e("FirebaseCrashlytics", ".");
                        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                        Log.e("FirebaseCrashlytics", ".");
                        Log.e("FirebaseCrashlytics", ".      /\\");
                        Log.e("FirebaseCrashlytics", ".     /  \\");
                        Log.e("FirebaseCrashlytics", ".    /    \\");
                        Log.e("FirebaseCrashlytics", ".   / |  | \\");
                        Log.e("FirebaseCrashlytics", ".     |  |");
                        Log.e("FirebaseCrashlytics", ".     |  |");
                        Log.e("FirebaseCrashlytics", ".     |  |");
                        Log.e("FirebaseCrashlytics", ".");
                        z2 = false;
                    }
                    if (z2) {
                        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                    }
                    FirebaseApp2 firebaseApp3 = crashlyticsCore3.f26501b;
                    firebaseApp3.m11668a();
                    String str7 = firebaseApp3.f26305f.f26320b;
                    try {
                        if (logger6.m11712a(4)) {
                            Log.i(logger6.f26422b, "Initializing Crashlytics 17.3.0", null);
                        }
                        FileStoreImpl fileStoreImpl = new FileStoreImpl(crashlyticsCore3.f26500a);
                        crashlyticsCore3.f26505f = new CrashlyticsFileMarker("crash_marker", fileStoreImpl);
                        crashlyticsCore3.f26504e = new CrashlyticsFileMarker("initialization_marker", fileStoreImpl);
                        HttpRequestFactory httpRequestFactory2 = new HttpRequestFactory();
                        ResourceUnityVersionProvider resourceUnityVersionProvider = new ResourceUnityVersionProvider(crashlyticsCore3.f26500a);
                        Context context2 = crashlyticsCore3.f26500a;
                        IdManager idManager3 = crashlyticsCore3.f26507h;
                        String packageName2 = context2.getPackageName();
                        String strM11776c2 = idManager3.m11776c();
                        PackageInfo packageInfo2 = context2.getPackageManager().getPackageInfo(packageName2, 0);
                        String string = Integer.toString(packageInfo2.versionCode);
                        str = packageInfo2.versionName;
                        if (str == null) {
                            str2 = "0.0";
                        } else {
                            str2 = str;
                        }
                        AppData appData = new AppData(str7, strM11748k, strM11776c2, packageName2, string, str2, resourceUnityVersionProvider);
                        logger6.m11713b("Installer package name is: " + appData.f26458c);
                        crashlyticsCore3.f26506g = new C5335t(crashlyticsCore3.f26500a, crashlyticsCore3.f26511l, httpRequestFactory2, crashlyticsCore3.f26507h, crashlyticsCore3.f26502c, fileStoreImpl, crashlyticsCore3.f26505f, appData, null, null, crashlyticsCore3.f26512m, crashlyticsCore3.f26509j, settingsController);
                        zExists = crashlyticsCore3.f26504e.m11766b().exists();
                        try {
                            Boolean.TRUE.equals((Boolean) Utils3.m11727a(crashlyticsCore3.f26511l.m11763b(new CrashlyticsCore4(crashlyticsCore3))));
                        } catch (Exception unused) {
                        }
                        C5335t c5335t = crashlyticsCore3.f26506g;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        c5335t.f26596m.m11763b(new CallableC5323n(c5335t));
                        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(new C5343x(c5335t), settingsController, defaultUncaughtExceptionHandler);
                        c5335t.f26588B = crashlyticsUncaughtExceptionHandler;
                        Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
                        if (zExists || !CommonUtils.m11739b(crashlyticsCore3.f26500a)) {
                            Logger4.f26421a.m11713b("Exception handling initialization successful");
                            z3 = true;
                        } else {
                            Logger4.f26421a.m11713b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                            crashlyticsCore3.m11760b(settingsController);
                            z3 = false;
                        }
                    } catch (Exception e2) {
                        Logger4 logger7 = Logger4.f26421a;
                        if (logger7.m11712a(6)) {
                            Log.e(logger7.f26422b, "Crashlytics was not started due to an exception during initialization", e2);
                        }
                        crashlyticsCore3.f26506g = null;
                    }
                    C4340s8.m10206c(executorServiceM10984e, new FirebaseCrashlytics(onboarding4, executorServiceM10984e, settingsController, z3, crashlyticsCore3));
                    return new FirebaseCrashlytics2(crashlyticsCore3);
                }
                logger6.m11713b("Configured not to require a build ID.");
                z2 = true;
                if (z2) {
                    throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                }
                FirebaseApp2 firebaseApp4 = crashlyticsCore3.f26501b;
                firebaseApp4.m11668a();
                String str8 = firebaseApp4.f26305f.f26320b;
                if (logger6.m11712a(4)) {
                    Log.i(logger6.f26422b, "Initializing Crashlytics 17.3.0", null);
                }
                FileStoreImpl fileStoreImpl2 = new FileStoreImpl(crashlyticsCore3.f26500a);
                crashlyticsCore3.f26505f = new CrashlyticsFileMarker("crash_marker", fileStoreImpl2);
                crashlyticsCore3.f26504e = new CrashlyticsFileMarker("initialization_marker", fileStoreImpl2);
                HttpRequestFactory httpRequestFactory3 = new HttpRequestFactory();
                ResourceUnityVersionProvider resourceUnityVersionProvider2 = new ResourceUnityVersionProvider(crashlyticsCore3.f26500a);
                Context context3 = crashlyticsCore3.f26500a;
                IdManager idManager4 = crashlyticsCore3.f26507h;
                String packageName3 = context3.getPackageName();
                String strM11776c3 = idManager4.m11776c();
                PackageInfo packageInfo3 = context3.getPackageManager().getPackageInfo(packageName3, 0);
                String string2 = Integer.toString(packageInfo3.versionCode);
                str = packageInfo3.versionName;
                if (str == null) {
                    str2 = "0.0";
                } else {
                    str2 = str;
                }
                AppData appData2 = new AppData(str8, strM11748k, strM11776c3, packageName3, string2, str2, resourceUnityVersionProvider2);
                logger6.m11713b("Installer package name is: " + appData2.f26458c);
                crashlyticsCore3.f26506g = new C5335t(crashlyticsCore3.f26500a, crashlyticsCore3.f26511l, httpRequestFactory3, crashlyticsCore3.f26507h, crashlyticsCore3.f26502c, fileStoreImpl2, crashlyticsCore3.f26505f, appData2, null, null, crashlyticsCore3.f26512m, crashlyticsCore3.f26509j, settingsController);
                zExists = crashlyticsCore3.f26504e.m11766b().exists();
                Boolean.TRUE.equals((Boolean) Utils3.m11727a(crashlyticsCore3.f26511l.m11763b(new CrashlyticsCore4(crashlyticsCore3))));
                C5335t c5335t2 = crashlyticsCore3.f26506g;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                c5335t2.f26596m.m11763b(new CallableC5323n(c5335t2));
                CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler2 = new CrashlyticsUncaughtExceptionHandler(new C5343x(c5335t2), settingsController, defaultUncaughtExceptionHandler2);
                c5335t2.f26588B = crashlyticsUncaughtExceptionHandler2;
                Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler2);
                if (zExists) {
                }
                Logger4.f26421a.m11713b("Exception handling initialization successful");
                z3 = true;
                C4340s8.m10206c(executorServiceM10984e, new FirebaseCrashlytics(onboarding4, executorServiceM10984e, settingsController, z3, crashlyticsCore3));
                return new FirebaseCrashlytics2(crashlyticsCore3);
            }
        });
        bVarM11686a.m11692d(2);
        return Arrays.asList(bVarM11686a.m11690b(), C4799a.m11010r("fire-cls", "17.3.0"));
    }
}

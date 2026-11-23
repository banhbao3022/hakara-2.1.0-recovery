package p007c.p190n.p385d.p391l.p392e.p406s;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4779h;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p395k.CommonUtils;
import p007c.p190n.p385d.p391l.p392e.p395k.DataCollectionArbiter;
import p007c.p190n.p385d.p391l.p392e.p395k.SystemCurrentTimeProvider;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpRequest;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpResponse;
import p007c.p190n.p385d.p391l.p392e.p400o.FileStoreImpl;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.AppSettingsData;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.FeaturesSettingsData;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.SessionSettingsData;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.Settings;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.SettingsData;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.SettingsRequest;
import p007c.p190n.p385d.p391l.p392e.p406s.p408i.DefaultSettingsSpiCall;
import p007c.p190n.p385d.p391l.p392e.p406s.p408i.SettingsSpiCall;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.n.d.l.e.s.c, reason: use source file name */
/* JADX INFO: compiled from: SettingsController.java */
/* JADX INFO: loaded from: classes.dex */
public class SettingsController implements SettingsDataProvider {

    /* JADX INFO: renamed from: a */
    public final Context f26955a;

    /* JADX INFO: renamed from: b */
    public final SettingsRequest f26956b;

    /* JADX INFO: renamed from: c */
    public final SettingsJsonParser f26957c;

    /* JADX INFO: renamed from: d */
    public final SystemCurrentTimeProvider f26958d;

    /* JADX INFO: renamed from: e */
    public final CachedSettingsIo f26959e;

    /* JADX INFO: renamed from: f */
    public final SettingsSpiCall f26960f;

    /* JADX INFO: renamed from: g */
    public final DataCollectionArbiter f26961g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference<Settings> f26962h;

    /* JADX INFO: renamed from: i */
    public final AtomicReference<C4782j<AppSettingsData>> f26963i;

    /* JADX INFO: renamed from: c.n.d.l.e.s.c$a */
    /* JADX INFO: compiled from: SettingsController.java */
    public class a implements InterfaceC4779h<Void, Void> {
        public a() {
        }

        @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4779h
        /* JADX INFO: renamed from: a */
        public AbstractC4781i<Void> mo5192a(Void r10) throws Exception {
            JSONObject jSONObjectM12042g;
            FileWriter fileWriter;
            SettingsController settingsController = SettingsController.this;
            SettingsSpiCall settingsSpiCall = settingsController.f26960f;
            SettingsRequest settingsRequest = settingsController.f26956b;
            DefaultSettingsSpiCall defaultSettingsSpiCall = (DefaultSettingsSpiCall) settingsSpiCall;
            Objects.requireNonNull(defaultSettingsSpiCall);
            FileWriter fileWriter2 = null;
            try {
                Map<String, String> mapM12041f = defaultSettingsSpiCall.m12041f(settingsRequest);
                HttpRequest httpRequestM11726c = defaultSettingsSpiCall.m11726c(mapM12041f);
                defaultSettingsSpiCall.m12039d(httpRequestM11726c, settingsRequest);
                defaultSettingsSpiCall.f27001f.m11713b("Requesting settings from " + defaultSettingsSpiCall.f26451b);
                defaultSettingsSpiCall.f27001f.m11713b("Settings query params were: " + mapM12041f);
                HttpResponse httpResponseM11968a = httpRequestM11726c.m11968a();
                defaultSettingsSpiCall.f27001f.m11713b("Settings request ID: " + httpResponseM11968a.f26891c.m13649c("X-REQUEST-ID"));
                jSONObjectM12042g = defaultSettingsSpiCall.m12042g(httpResponseM11968a);
            } catch (IOException e) {
                Logger4 logger4 = defaultSettingsSpiCall.f27001f;
                if (logger4.m11712a(6)) {
                    Log.e(logger4.f26422b, "Settings request failed.", e);
                }
                jSONObjectM12042g = null;
            }
            if (jSONObjectM12042g != null) {
                SettingsData settingsDataM12035a = SettingsController.this.f26957c.m12035a(jSONObjectM12042g);
                CachedSettingsIo cachedSettingsIo = SettingsController.this.f26959e;
                long j2 = settingsDataM12035a.f26990d;
                Objects.requireNonNull(cachedSettingsIo);
                Logger4.f26421a.m11713b("Writing settings to cache file...");
                try {
                    jSONObjectM12042g.put("expires_at", j2);
                    fileWriter = new FileWriter(new File(new FileStoreImpl(cachedSettingsIo.f26954a).m11983a(), "com.crashlytics.settings.json"));
                    try {
                        fileWriter.write(jSONObjectM12042g.toString());
                        fileWriter.flush();
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            Logger4 logger5 = Logger4.f26421a;
                            if (logger5.m11712a(6)) {
                                Log.e(logger5.f26422b, "Failed to cache settings", e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileWriter2 = fileWriter;
                            fileWriter = fileWriter2;
                            CommonUtils.m11740c(fileWriter, "Failed to close settings writer.");
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        CommonUtils.m11740c(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileWriter = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileWriter = fileWriter2;
                    CommonUtils.m11740c(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
                CommonUtils.m11740c(fileWriter, "Failed to close settings writer.");
                SettingsController.this.m12034e(jSONObjectM12042g, "Loaded settings: ");
                SettingsController settingsController2 = SettingsController.this;
                String str = settingsController2.f26956b.f26996f;
                SharedPreferences.Editor editorEdit = CommonUtils.m11751n(settingsController2.f26955a).edit();
                editorEdit.putString("existing_instance_identifier", str);
                editorEdit.apply();
                SettingsController.this.f26962h.set(settingsDataM12035a);
                SettingsController.this.f26963i.get().m10948b(settingsDataM12035a.f26987a);
                C4782j<AppSettingsData> c4782j = new C4782j<>();
                c4782j.m10948b(settingsDataM12035a.f26987a);
                SettingsController.this.f26963i.set(c4782j);
            }
            return C4340s8.m10208e(null);
        }
    }

    public SettingsController(Context context, SettingsRequest settingsRequest, SystemCurrentTimeProvider systemCurrentTimeProvider, SettingsJsonParser settingsJsonParser, CachedSettingsIo cachedSettingsIo, SettingsSpiCall settingsSpiCall, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference<Settings> atomicReference = new AtomicReference<>();
        this.f26962h = atomicReference;
        this.f26963i = new AtomicReference<>(new C4782j());
        this.f26955a = context;
        this.f26956b = settingsRequest;
        this.f26958d = systemCurrentTimeProvider;
        this.f26957c = settingsJsonParser;
        this.f26959e = cachedSettingsIo;
        this.f26960f = settingsSpiCall;
        this.f26961g = dataCollectionArbiter;
        JSONObject jSONObject = new JSONObject();
        atomicReference.set(new SettingsData(DefaultSettingsJsonTransform.m12028b(systemCurrentTimeProvider, 3600L, jSONObject), null, new SessionSettingsData(jSONObject.optInt("max_custom_exception_events", 8), 4), new FeaturesSettingsData(jSONObject.optBoolean("collect_reports", true)), 0, 3600));
    }

    /* JADX INFO: renamed from: a */
    public AbstractC4781i<AppSettingsData> m12030a() {
        return this.f26963i.get().f24683a;
    }

    /* JADX INFO: renamed from: b */
    public final SettingsData m12031b(int i) throws Throwable {
        SettingsData settingsData = null;
        try {
            if (!C7804v0.m15313c(2, i)) {
                JSONObject jSONObjectM12027a = this.f26959e.m12027a();
                if (jSONObjectM12027a != null) {
                    SettingsData settingsDataM12035a = this.f26957c.m12035a(jSONObjectM12027a);
                    if (settingsDataM12035a != null) {
                        m12034e(jSONObjectM12027a, "Loaded cached settings: ");
                        Objects.requireNonNull(this.f26958d);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (C7804v0.m15313c(3, i)) {
                            try {
                                Logger4.f26421a.m11713b("Returning cached settings.");
                                settingsData = settingsDataM12035a;
                            } catch (Exception e) {
                                e = e;
                                settingsData = settingsDataM12035a;
                                Logger4 logger4 = Logger4.f26421a;
                                if (logger4.m11712a(6)) {
                                    Log.e(logger4.f26422b, "Failed to get cached settings", e);
                                }
                            }
                        } else {
                            if (settingsDataM12035a.f26990d < jCurrentTimeMillis) {
                                Logger4.f26421a.m11713b("Cached settings have expired.");
                            } else {
                                Logger4.f26421a.m11713b("Returning cached settings.");
                                settingsData = settingsDataM12035a;
                            }
                        }
                    } else {
                        Logger4 logger5 = Logger4.f26421a;
                        if (logger5.m11712a(6)) {
                            Log.e(logger5.f26422b, "Failed to parse cached settings data.", null);
                        }
                    }
                } else {
                    Logger4.f26421a.m11713b("No cached settings data found.");
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return settingsData;
    }

    /* JADX INFO: renamed from: c */
    public Settings m12032c() {
        return this.f26962h.get();
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;Ljava/util/concurrent/Executor;)Lc/n/b/d/n/i<Ljava/lang/Void;>; */
    /* JADX INFO: renamed from: d */
    public AbstractC4781i m12033d(int i, Executor executor) throws Throwable {
        SettingsData settingsDataM12031b;
        if (!(!CommonUtils.m11751n(this.f26955a).getString("existing_instance_identifier", "").equals(this.f26956b.f26996f)) && (settingsDataM12031b = m12031b(i)) != null) {
            this.f26962h.set(settingsDataM12031b);
            this.f26963i.get().m10948b(settingsDataM12031b.f26987a);
            return C4340s8.m10208e(null);
        }
        SettingsData settingsDataM12031b2 = m12031b(3);
        if (settingsDataM12031b2 != null) {
            this.f26962h.set(settingsDataM12031b2);
            this.f26963i.get().m10948b(settingsDataM12031b2.f26987a);
        }
        return this.f26961g.m11771b().mo10942o(executor, new a());
    }

    /* JADX INFO: renamed from: e */
    public final void m12034e(JSONObject jSONObject, String str) throws JSONException {
        Logger4 logger4 = Logger4.f26421a;
        StringBuilder sbM1556G = outline.m1556G(str);
        sbM1556G.append(jSONObject.toString());
        logger4.m11713b(sbM1556G.toString());
    }
}

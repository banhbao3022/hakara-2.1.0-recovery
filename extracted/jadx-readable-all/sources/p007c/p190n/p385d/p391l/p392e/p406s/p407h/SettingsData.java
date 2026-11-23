package p007c.p190n.p385d.p391l.p392e.p406s.p407h;

/* JADX INFO: renamed from: c.n.d.l.e.s.h.f, reason: use source file name */
/* JADX INFO: compiled from: SettingsData.java */
/* JADX INFO: loaded from: classes.dex */
public class SettingsData implements Settings {

    /* JADX INFO: renamed from: a */
    public final AppSettingsData f26987a;

    /* JADX INFO: renamed from: b */
    public final SessionSettingsData f26988b;

    /* JADX INFO: renamed from: c */
    public final FeaturesSettingsData f26989c;

    /* JADX INFO: renamed from: d */
    public final long f26990d;

    public SettingsData(long j2, AppSettingsData appSettingsData, SessionSettingsData sessionSettingsData, FeaturesSettingsData featuresSettingsData, int i, int i2) {
        this.f26990d = j2;
        this.f26987a = appSettingsData;
        this.f26988b = sessionSettingsData;
        this.f26989c = featuresSettingsData;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p406s.p407h.Settings
    /* JADX INFO: renamed from: a */
    public FeaturesSettingsData mo12036a() {
        return this.f26989c;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p406s.p407h.Settings
    /* JADX INFO: renamed from: b */
    public SessionSettingsData mo12037b() {
        return this.f26988b;
    }
}

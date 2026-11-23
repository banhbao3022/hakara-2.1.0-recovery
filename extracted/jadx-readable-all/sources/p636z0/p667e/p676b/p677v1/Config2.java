package p636z0.p667e.p676b.p677v1;

/* JADX INFO: renamed from: z0.e.b.v1.j0, reason: use source file name */
/* JADX INFO: compiled from: Config.java */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Config2 {
    /* JADX INFO: renamed from: a */
    public static Config3 m15381a(Config3 config3, Config3 config4) {
        if (config3 == null && config4 == null) {
            return OptionsBundle.f36110r;
        }
        MutableOptionsBundle mutableOptionsBundleM15435z = config4 != null ? MutableOptionsBundle.m15435z(config4) : MutableOptionsBundle.m15434y();
        if (config3 != null) {
            for (Config3.a<?> aVar : config3.mo15104c()) {
                mutableOptionsBundleM15435z.m15436A(aVar, config3.mo15106e(aVar), config3.mo15102a(aVar));
            }
        }
        return OptionsBundle.m15339x(mutableOptionsBundleM15435z);
    }
}

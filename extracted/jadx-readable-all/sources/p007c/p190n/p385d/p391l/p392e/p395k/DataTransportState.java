package p007c.p190n.p385d.p391l.p392e.p395k;

import p007c.p190n.p385d.p391l.p392e.p406s.p407h.AppSettingsData;

/* JADX INFO: renamed from: c.n.d.l.e.k.n0, reason: use source file name */
/* JADX INFO: compiled from: DataTransportState.java */
/* JADX INFO: loaded from: classes.dex */
public enum DataTransportState {
    NONE,
    JAVA_ONLY,
    ALL;

    /* JADX INFO: renamed from: f */
    public static DataTransportState m11772f(AppSettingsData appSettingsData) {
        boolean z = appSettingsData.f26982g == 2;
        boolean z2 = appSettingsData.f26983h == 2;
        if (z) {
            return !z2 ? JAVA_ONLY : ALL;
        }
        return NONE;
    }
}

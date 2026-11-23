package p007c.p190n.p385d.p391l.p392e.p395k;

import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p385d.p391l.p392e.p406s.SettingsDataProvider;

/* JADX INFO: renamed from: c.n.d.l.e.k.f0, reason: use source file name */
/* JADX INFO: compiled from: CrashlyticsCore.java */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsCore2 implements Callable<AbstractC4781i<Void>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SettingsDataProvider f26483a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CrashlyticsCore3 f26484b;

    public CrashlyticsCore2(CrashlyticsCore3 crashlyticsCore3, SettingsDataProvider settingsDataProvider) {
        this.f26484b = crashlyticsCore3;
        this.f26483a = settingsDataProvider;
    }

    @Override // java.util.concurrent.Callable
    public AbstractC4781i<Void> call() throws Exception {
        return CrashlyticsCore3.m11759a(this.f26484b, this.f26483a);
    }
}

package p007c.p190n.p385d.p391l.p392e;

import android.util.Log;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4779h;
import p007c.p190n.p385d.p391l.p392e.p406s.SettingsController;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.AppSettingsData;

/* JADX INFO: renamed from: c.n.d.l.e.e, reason: use source file name */
/* JADX INFO: compiled from: Onboarding.java */
/* JADX INFO: loaded from: classes.dex */
public class Onboarding implements InterfaceC4779h<AppSettingsData, Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f26425a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SettingsController f26426b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Executor f26427c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Onboarding4 f26428d;

    public Onboarding(Onboarding4 onboarding4, String str, SettingsController settingsController, Executor executor) {
        this.f26428d = onboarding4;
        this.f26425a = str;
        this.f26426b = settingsController;
        this.f26427c = executor;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4779h
    /* JADX INFO: renamed from: a */
    public AbstractC4781i<Void> mo5192a(AppSettingsData appSettingsData) throws Exception {
        try {
            Onboarding4.m11718a(this.f26428d, appSettingsData, this.f26425a, this.f26426b, this.f26427c, true);
            return null;
        } catch (Exception e) {
            Logger4 logger4 = Logger4.f26421a;
            if (logger4.m11712a(6)) {
                Log.e(logger4.f26422b, "Error performing auto configuration.", e);
            }
            throw e;
        }
    }
}

package p007c.p190n.p385d.p421t;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry;

/* JADX INFO: renamed from: c.n.d.t.j, reason: use source file name */
/* JADX INFO: compiled from: GetAuthTokenListener.java */
/* JADX INFO: loaded from: classes.dex */
public class GetAuthTokenListener implements StateListener {

    /* JADX INFO: renamed from: a */
    public final Utils6 f27151a;

    /* JADX INFO: renamed from: b */
    public final C4782j<InstallationTokenResult> f27152b;

    public GetAuthTokenListener(Utils6 utils6, C4782j<InstallationTokenResult> c4782j) {
        this.f27151a = utils6;
        this.f27152b = c4782j;
    }

    @Override // p007c.p190n.p385d.p421t.StateListener
    /* JADX INFO: renamed from: a */
    public boolean mo12111a(Exception exc) {
        this.f27152b.m10947a(exc);
        return true;
    }

    @Override // p007c.p190n.p385d.p421t.StateListener
    /* JADX INFO: renamed from: b */
    public boolean mo12112b(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.m12140j() || this.f27151a.m12117d(persistedInstallationEntry)) {
            return false;
        }
        C4782j<InstallationTokenResult> c4782j = this.f27152b;
        AutoValue_InstallationTokenResult.b bVar = new AutoValue_InstallationTokenResult.b();
        String strMo12119a = persistedInstallationEntry.mo12119a();
        Objects.requireNonNull(strMo12119a, "Null token");
        bVar.f27121a = strMo12119a;
        bVar.f27122b = Long.valueOf(persistedInstallationEntry.mo12120b());
        bVar.f27123c = Long.valueOf(persistedInstallationEntry.mo12125g());
        String strM1599u = bVar.f27121a == null ? " token" : "";
        if (bVar.f27122b == null) {
            strM1599u = outline.m1599u(strM1599u, " tokenExpirationTimestamp");
        }
        if (bVar.f27123c == null) {
            strM1599u = outline.m1599u(strM1599u, " tokenCreationTimestamp");
        }
        if (!strM1599u.isEmpty()) {
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }
        c4782j.f24683a.m10944q(new AutoValue_InstallationTokenResult(bVar.f27121a, bVar.f27122b.longValue(), bVar.f27123c.longValue(), null));
        return true;
    }
}

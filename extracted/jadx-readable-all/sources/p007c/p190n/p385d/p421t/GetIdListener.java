package p007c.p190n.p385d.p421t;

import p007c.p190n.p194b.p266d.p333n.C4782j;
import p007c.p190n.p385d.p421t.p423q.PersistedInstallation;
import p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry;

/* JADX INFO: renamed from: c.n.d.t.k, reason: use source file name */
/* JADX INFO: compiled from: GetIdListener.java */
/* JADX INFO: loaded from: classes.dex */
public class GetIdListener implements StateListener {

    /* JADX INFO: renamed from: a */
    public final C4782j<String> f27153a;

    public GetIdListener(C4782j<String> c4782j) {
        this.f27153a = c4782j;
    }

    @Override // p007c.p190n.p385d.p421t.StateListener
    /* JADX INFO: renamed from: a */
    public boolean mo12111a(Exception exc) {
        return false;
    }

    @Override // p007c.p190n.p385d.p421t.StateListener
    /* JADX INFO: renamed from: b */
    public boolean mo12112b(PersistedInstallationEntry persistedInstallationEntry) {
        if (!(persistedInstallationEntry.mo12124f() == PersistedInstallation.a.UNREGISTERED) && !persistedInstallationEntry.m12140j() && !persistedInstallationEntry.m12138h()) {
            return false;
        }
        this.f27153a.m10948b(persistedInstallationEntry.mo12121c());
        return true;
    }
}

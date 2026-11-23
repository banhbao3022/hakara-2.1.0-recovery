package p007c.p190n.p385d.p421t.p423q;

/* JADX INFO: renamed from: c.n.d.t.q.d, reason: use source file name */
/* JADX INFO: compiled from: PersistedInstallationEntry.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class PersistedInstallationEntry {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f27185a = 0;

    /* JADX INFO: renamed from: c.n.d.t.q.d$a */
    /* JADX INFO: compiled from: PersistedInstallationEntry.java */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract PersistedInstallationEntry mo12127a();

        /* JADX INFO: renamed from: b */
        public abstract a mo12128b(String str);

        /* JADX INFO: renamed from: c */
        public abstract a mo12129c(long j2);

        /* JADX INFO: renamed from: d */
        public abstract a mo12130d(String str);

        /* JADX INFO: renamed from: e */
        public abstract a mo12131e(String str);

        /* JADX INFO: renamed from: f */
        public abstract a mo12132f(String str);

        /* JADX INFO: renamed from: g */
        public abstract a mo12133g(PersistedInstallation.a aVar);

        /* JADX INFO: renamed from: h */
        public abstract a mo12134h(long j2);
    }

    static {
        AutoValue_PersistedInstallationEntry.b bVar = new AutoValue_PersistedInstallationEntry.b();
        bVar.mo12134h(0L);
        bVar.mo12133g(PersistedInstallation.a.ATTEMPT_MIGRATION);
        bVar.mo12129c(0L);
        bVar.mo12127a();
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo12119a();

    /* JADX INFO: renamed from: b */
    public abstract long mo12120b();

    /* JADX INFO: renamed from: c */
    public abstract String mo12121c();

    /* JADX INFO: renamed from: d */
    public abstract String mo12122d();

    /* JADX INFO: renamed from: e */
    public abstract String mo12123e();

    /* JADX INFO: renamed from: f */
    public abstract PersistedInstallation.a mo12124f();

    /* JADX INFO: renamed from: g */
    public abstract long mo12125g();

    /* JADX INFO: renamed from: h */
    public boolean m12138h() {
        return mo12124f() == PersistedInstallation.a.REGISTER_ERROR;
    }

    /* JADX INFO: renamed from: i */
    public boolean m12139i() {
        return mo12124f() == PersistedInstallation.a.NOT_GENERATED || mo12124f() == PersistedInstallation.a.ATTEMPT_MIGRATION;
    }

    /* JADX INFO: renamed from: j */
    public boolean m12140j() {
        return mo12124f() == PersistedInstallation.a.REGISTERED;
    }

    /* JADX INFO: renamed from: k */
    public abstract a mo12126k();
}

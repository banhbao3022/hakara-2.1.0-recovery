package p526i1.p530b.p531a;

import java.util.logging.Level;

/* JADX INFO: renamed from: i1.b.a.g, reason: use source file name */
/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes2.dex */
public interface Logger5 {

    /* JADX INFO: renamed from: i1.b.a.g$a */
    /* JADX INFO: compiled from: Logger.java */
    public static class a implements Logger5 {
        @Override // p526i1.p530b.p531a.Logger5
        /* JADX INFO: renamed from: a */
        public void mo13822a(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }

        @Override // p526i1.p530b.p531a.Logger5
        /* JADX INFO: renamed from: b */
        public void mo13823b(Level level, String str, Throwable th) {
            System.out.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo13822a(Level level, String str);

    /* JADX INFO: renamed from: b */
    void mo13823b(Level level, String str, Throwable th);
}

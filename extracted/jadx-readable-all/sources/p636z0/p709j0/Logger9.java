package p636z0.p709j0;

import android.util.Log;

/* JADX INFO: renamed from: z0.j0.m, reason: use source file name */
/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Logger9 {

    /* JADX INFO: renamed from: a */
    public static Logger9 f37271a;

    /* JADX INFO: renamed from: z0.j0.m$a */
    /* JADX INFO: compiled from: Logger.java */
    public static class a extends Logger9 {

        /* JADX INFO: renamed from: b */
        public int f37272b;

        public a(int i) {
            super(i);
            this.f37272b = i;
        }

        @Override // p636z0.p709j0.Logger9
        /* JADX INFO: renamed from: a */
        public void mo15887a(String str, String str2, Throwable... thArr) {
            if (this.f37272b <= 3) {
                if (thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // p636z0.p709j0.Logger9
        /* JADX INFO: renamed from: b */
        public void mo15888b(String str, String str2, Throwable... thArr) {
            if (this.f37272b <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // p636z0.p709j0.Logger9
        /* JADX INFO: renamed from: d */
        public void mo15889d(String str, String str2, Throwable... thArr) {
            if (this.f37272b <= 4) {
                if (thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // p636z0.p709j0.Logger9
        /* JADX INFO: renamed from: f */
        public void mo15890f(String str, String str2, Throwable... thArr) {
            if (this.f37272b <= 2) {
                if (thArr.length >= 1) {
                    Log.v(str, str2, thArr[0]);
                } else {
                    Log.v(str, str2);
                }
            }
        }

        @Override // p636z0.p709j0.Logger9
        /* JADX INFO: renamed from: g */
        public void mo15891g(String str, String str2, Throwable... thArr) {
            if (this.f37272b <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public Logger9(int i) {
    }

    /* JADX INFO: renamed from: c */
    public static synchronized Logger9 m15885c() {
        if (f37271a == null) {
            f37271a = new a(3);
        }
        return f37271a;
    }

    /* JADX INFO: renamed from: e */
    public static String m15886e(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo15887a(String str, String str2, Throwable... thArr);

    /* JADX INFO: renamed from: b */
    public abstract void mo15888b(String str, String str2, Throwable... thArr);

    /* JADX INFO: renamed from: d */
    public abstract void mo15889d(String str, String str2, Throwable... thArr);

    /* JADX INFO: renamed from: f */
    public abstract void mo15890f(String str, String str2, Throwable... thArr);

    /* JADX INFO: renamed from: g */
    public abstract void mo15891g(String str, String str2, Throwable... thArr);
}

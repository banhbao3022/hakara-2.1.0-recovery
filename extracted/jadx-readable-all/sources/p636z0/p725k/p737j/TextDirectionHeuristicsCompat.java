package p636z0.p725k.p737j;

/* JADX INFO: renamed from: z0.k.j.d, reason: use source file name */
/* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class TextDirectionHeuristicsCompat {

    /* JADX INFO: renamed from: a */
    public static final TextDirectionHeuristicCompat f37963a = new d(null, false);

    /* JADX INFO: renamed from: b */
    public static final TextDirectionHeuristicCompat f37964b = new d(null, true);

    /* JADX INFO: renamed from: c */
    public static final TextDirectionHeuristicCompat f37965c;

    /* JADX INFO: renamed from: d */
    public static final TextDirectionHeuristicCompat f37966d;

    /* JADX INFO: renamed from: z0.k.j.d$a */
    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static class a implements b {

        /* JADX INFO: renamed from: a */
        public static final a f37967a = new a();

        /* JADX WARN: Code duplicated, block: B:11:0x001d  */
        /* JADX WARN: Code duplicated, block: B:12:0x001f  */
        @Override // p636z0.p725k.p737j.TextDirectionHeuristicsCompat.b
        /* JADX INFO: renamed from: a */
        public int mo16215a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i));
                TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f37963a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i4 = 1;
                                break;
                            case 16:
                            case 17:
                                i4 = 0;
                                break;
                            default:
                                i4 = 2;
                                break;
                        }
                    } else {
                        i4 = 0;
                    }
                } else {
                    i4 = 1;
                }
                i++;
            }
            return i4;
        }
    }

    /* JADX INFO: renamed from: z0.k.j.d$b */
    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        int mo16215a(CharSequence charSequence, int i, int i2);
    }

    /* JADX INFO: renamed from: z0.k.j.d$c */
    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static abstract class c implements TextDirectionHeuristicCompat {

        /* JADX INFO: renamed from: a */
        public final b f37968a;

        public c(b bVar) {
            this.f37968a = bVar;
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo16216a();

        /* JADX INFO: renamed from: b */
        public boolean m16217b(CharSequence charSequence, int i, int i2) {
            if (i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f37968a;
            if (bVar == null) {
                return mo16216a();
            }
            int iMo16215a = bVar.mo16215a(charSequence, i, i2);
            if (iMo16215a == 0) {
                return true;
            }
            if (iMo16215a != 1) {
                return mo16216a();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: z0.k.j.d$d */
    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static class d extends c {

        /* JADX INFO: renamed from: b */
        public final boolean f37969b;

        public d(b bVar, boolean z) {
            super(bVar);
            this.f37969b = z;
        }

        @Override // p636z0.p725k.p737j.TextDirectionHeuristicsCompat.c
        /* JADX INFO: renamed from: a */
        public boolean mo16216a() {
            return this.f37969b;
        }
    }

    static {
        a aVar = a.f37967a;
        f37965c = new d(aVar, false);
        f37966d = new d(aVar, true);
    }
}

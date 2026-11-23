package p007c.p190n.p378c.p379a;

import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.a.b, reason: use source file name */
/* JADX INFO: compiled from: CharMatcher.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class CharMatcher implements Predicate2<Character> {

    /* JADX INFO: renamed from: c.n.c.a.b$a */
    /* JADX INFO: compiled from: CharMatcher.java */
    public static abstract class a extends CharMatcher {
        @Override // p007c.p190n.p378c.p379a.Predicate2
        @Deprecated
        public boolean apply(Character ch) {
            return mo11578b(ch.charValue());
        }
    }

    /* JADX INFO: renamed from: c.n.c.a.b$b */
    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class b extends a {

        /* JADX INFO: renamed from: a */
        public final char f26126a;

        public b(char c2) {
            this.f26126a = c2;
        }

        @Override // p007c.p190n.p378c.p379a.CharMatcher
        /* JADX INFO: renamed from: b */
        public boolean mo11578b(char c2) {
            return c2 == this.f26126a;
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("CharMatcher.is('");
            char c2 = this.f26126a;
            char[] cArr = {'\\', 'u', 0, 0, 0, 0};
            for (int i = 0; i < 4; i++) {
                cArr[5 - i] = "0123456789ABCDEF".charAt(c2 & 15);
                c2 = (char) (c2 >> 4);
            }
            sbM1556G.append(String.copyValueOf(cArr));
            sbM1556G.append("')");
            return sbM1556G.toString();
        }
    }

    /* JADX INFO: renamed from: c.n.c.a.b$c */
    /* JADX INFO: compiled from: CharMatcher.java */
    public static abstract class c extends a {

        /* JADX INFO: renamed from: a */
        public final String f26127a;

        public c(String str) {
            this.f26127a = str;
        }

        public final String toString() {
            return this.f26127a;
        }
    }

    /* JADX INFO: renamed from: c.n.c.a.b$d */
    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class d extends c {

        /* JADX INFO: renamed from: b */
        public static final d f26128b = new d();

        public d() {
            super("CharMatcher.none()");
        }

        @Override // p007c.p190n.p378c.p379a.CharMatcher
        /* JADX INFO: renamed from: a */
        public int mo11577a(CharSequence charSequence, int i) {
            C4799a.m11002n(i, charSequence.length());
            return -1;
        }

        @Override // p007c.p190n.p378c.p379a.CharMatcher
        /* JADX INFO: renamed from: b */
        public boolean mo11578b(char c2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public int mo11577a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C4799a.m11002n(i, length);
        while (i < length) {
            if (mo11578b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo11578b(char c2);
}

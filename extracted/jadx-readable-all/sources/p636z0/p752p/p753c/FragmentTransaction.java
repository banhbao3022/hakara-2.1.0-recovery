package p636z0.p752p.p753c;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p759s.Lifecycle3;

/* JADX INFO: renamed from: z0.p.c.j0, reason: use source file name */
/* JADX INFO: compiled from: FragmentTransaction.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentTransaction {

    /* JADX INFO: renamed from: b */
    public int f38353b;

    /* JADX INFO: renamed from: c */
    public int f38354c;

    /* JADX INFO: renamed from: d */
    public int f38355d;

    /* JADX INFO: renamed from: e */
    public int f38356e;

    /* JADX INFO: renamed from: f */
    public int f38357f;

    /* JADX INFO: renamed from: g */
    public boolean f38358g;

    /* JADX INFO: renamed from: i */
    public String f38360i;

    /* JADX INFO: renamed from: j */
    public int f38361j;

    /* JADX INFO: renamed from: k */
    public CharSequence f38362k;

    /* JADX INFO: renamed from: l */
    public int f38363l;

    /* JADX INFO: renamed from: m */
    public CharSequence f38364m;

    /* JADX INFO: renamed from: n */
    public ArrayList<String> f38365n;

    /* JADX INFO: renamed from: o */
    public ArrayList<String> f38366o;

    /* JADX INFO: renamed from: a */
    public ArrayList<a> f38352a = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public boolean f38359h = true;

    /* JADX INFO: renamed from: p */
    public boolean f38367p = false;

    /* JADX INFO: renamed from: z0.p.c.j0$a */
    /* JADX INFO: compiled from: FragmentTransaction.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f38368a;

        /* JADX INFO: renamed from: b */
        public Fragment f38369b;

        /* JADX INFO: renamed from: c */
        public int f38370c;

        /* JADX INFO: renamed from: d */
        public int f38371d;

        /* JADX INFO: renamed from: e */
        public int f38372e;

        /* JADX INFO: renamed from: f */
        public int f38373f;

        /* JADX INFO: renamed from: g */
        public Lifecycle3.b f38374g;

        /* JADX INFO: renamed from: h */
        public Lifecycle3.b f38375h;

        public a() {
        }

        public a(int i, Fragment fragment) {
            this.f38368a = i;
            this.f38369b = fragment;
            Lifecycle3.b bVar = Lifecycle3.b.RESUMED;
            this.f38374g = bVar;
            this.f38375h = bVar;
        }

        public a(int i, Fragment fragment, Lifecycle3.b bVar) {
            this.f38368a = i;
            this.f38369b = fragment;
            this.f38374g = fragment.f38424U;
            this.f38375h = bVar;
        }
    }

    @Deprecated
    public FragmentTransaction() {
    }

    /* JADX INFO: renamed from: b */
    public void m16505b(a aVar) {
        this.f38352a.add(aVar);
        aVar.f38370c = this.f38353b;
        aVar.f38371d = this.f38354c;
        aVar.f38372e = this.f38355d;
        aVar.f38373f = this.f38356e;
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo16444c();

    /* JADX INFO: renamed from: d */
    public abstract void mo16445d();

    /* JADX INFO: renamed from: e */
    public abstract void mo16446e();

    /* JADX INFO: renamed from: f */
    public FragmentTransaction mo16447f(Fragment fragment) {
        m16505b(new a(6, fragment));
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void mo16448g(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sbM1556G = outline.m1556G("Fragment ");
            sbM1556G.append(cls.getCanonicalName());
            sbM1556G.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sbM1556G.toString());
        }
        if (str != null) {
            String str2 = fragment.f38408E;
            if (str2 != null && !str.equals(str2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                throw new IllegalStateException(outline.m1552C(sb, fragment.f38408E, " now ", str));
            }
            fragment.f38408E = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.f38406C;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f38406C + " now " + i);
            }
            fragment.f38406C = i;
            fragment.f38407D = i;
        }
        m16505b(new a(i2, fragment));
    }

    /* JADX INFO: renamed from: h */
    public FragmentTransaction mo16449h(Fragment fragment) {
        m16505b(new a(3, fragment));
        return this;
    }

    /* JADX INFO: renamed from: i */
    public FragmentTransaction m16506i(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo16448g(i, fragment, str, 2);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public FragmentTransaction m16507j(int i, int i2) {
        this.f38353b = i;
        this.f38354c = i2;
        this.f38355d = 0;
        this.f38356e = 0;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public FragmentTransaction mo16450k(Fragment fragment, Lifecycle3.b bVar) {
        m16505b(new a(10, fragment, bVar));
        return this;
    }

    /* JADX INFO: renamed from: l */
    public FragmentTransaction mo16451l(Fragment fragment) {
        m16505b(new a(8, fragment));
        return this;
    }

    /* JADX INFO: renamed from: m */
    public FragmentTransaction mo16452m(Fragment fragment) {
        m16505b(new a(5, fragment));
        return this;
    }

    public FragmentTransaction(FragmentFactory fragmentFactory, ClassLoader classLoader) {
    }
}

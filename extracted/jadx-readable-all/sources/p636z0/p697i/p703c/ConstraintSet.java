package p636z0.p697i.p703c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p697i.p698a.p699a.Easing;

/* JADX INFO: renamed from: z0.i.c.d, reason: use source file name */
/* JADX INFO: compiled from: ConstraintSet.java */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintSet {

    /* JADX INFO: renamed from: a */
    public static final int[] f37045a = {0, 4, 8};

    /* JADX INFO: renamed from: b */
    public static SparseIntArray f37046b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, ConstraintAttribute> f37047c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public boolean f37048d = true;

    /* JADX INFO: renamed from: e */
    public HashMap<Integer, a> f37049e = new HashMap<>();

    /* JADX INFO: renamed from: z0.i.c.d$a */
    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f37050a;

        /* JADX INFO: renamed from: b */
        public final d f37051b = new d();

        /* JADX INFO: renamed from: c */
        public final c f37052c = new c();

        /* JADX INFO: renamed from: d */
        public final b f37053d = new b();

        /* JADX INFO: renamed from: e */
        public final e f37054e = new e();

        /* JADX INFO: renamed from: f */
        public HashMap<String, ConstraintAttribute> f37055f = new HashMap<>();

        /* JADX INFO: renamed from: a */
        public void m15855a(ConstraintLayout.C0094a c0094a) {
            b bVar = this.f37053d;
            c0094a.f574d = bVar.f37098i;
            c0094a.f576e = bVar.f37100j;
            c0094a.f578f = bVar.f37102k;
            c0094a.f580g = bVar.f37104l;
            c0094a.f582h = bVar.f37105m;
            c0094a.f584i = bVar.f37106n;
            c0094a.f586j = bVar.f37107o;
            c0094a.f588k = bVar.f37108p;
            c0094a.f590l = bVar.f37109q;
            c0094a.f596p = bVar.f37110r;
            c0094a.f597q = bVar.f37111s;
            c0094a.f598r = bVar.f37112t;
            c0094a.f599s = bVar.f37113u;
            ((ViewGroup.MarginLayoutParams) c0094a).leftMargin = bVar.f37061E;
            ((ViewGroup.MarginLayoutParams) c0094a).rightMargin = bVar.f37062F;
            ((ViewGroup.MarginLayoutParams) c0094a).topMargin = bVar.f37063G;
            ((ViewGroup.MarginLayoutParams) c0094a).bottomMargin = bVar.f37064H;
            c0094a.f604x = bVar.f37072P;
            c0094a.f605y = bVar.f37071O;
            c0094a.f601u = bVar.f37068L;
            c0094a.f603w = bVar.f37070N;
            c0094a.f606z = bVar.f37114v;
            c0094a.f542A = bVar.f37115w;
            c0094a.f592m = bVar.f37117y;
            c0094a.f594n = bVar.f37118z;
            b bVar2 = this.f37053d;
            c0094a.f595o = bVar2.f37057A;
            c0094a.f543B = bVar2.f37116x;
            c0094a.f558Q = bVar2.f37058B;
            c0094a.f559R = bVar2.f37059C;
            c0094a.f547F = bVar2.f37073Q;
            c0094a.f546E = bVar2.f37074R;
            c0094a.f549H = bVar2.f37076T;
            c0094a.f548G = bVar2.f37075S;
            c0094a.f561T = bVar2.f37099i0;
            c0094a.f562U = bVar2.f37101j0;
            c0094a.f550I = bVar2.f37077U;
            c0094a.f551J = bVar2.f37078V;
            c0094a.f554M = bVar2.f37079W;
            c0094a.f555N = bVar2.f37080X;
            c0094a.f552K = bVar2.f37081Y;
            c0094a.f553L = bVar2.f37082Z;
            c0094a.f556O = bVar2.f37083a0;
            c0094a.f557P = bVar2.f37085b0;
            c0094a.f560S = bVar2.f37060D;
            c0094a.f572c = bVar2.f37096h;
            c0094a.f568a = bVar2.f37092f;
            c0094a.f570b = bVar2.f37094g;
            ((ViewGroup.MarginLayoutParams) c0094a).width = bVar2.f37088d;
            ((ViewGroup.MarginLayoutParams) c0094a).height = bVar2.f37090e;
            String str = bVar2.f37097h0;
            if (str != null) {
                c0094a.f563V = str;
            }
            c0094a.setMarginStart(this.f37053d.f37066J);
            c0094a.setMarginEnd(this.f37053d.f37065I);
            c0094a.m284a();
        }

        /* JADX INFO: renamed from: b */
        public final void m15856b(int i, ConstraintLayout.C0094a c0094a) {
            this.f37050a = i;
            b bVar = this.f37053d;
            bVar.f37098i = c0094a.f574d;
            bVar.f37100j = c0094a.f576e;
            bVar.f37102k = c0094a.f578f;
            bVar.f37104l = c0094a.f580g;
            bVar.f37105m = c0094a.f582h;
            bVar.f37106n = c0094a.f584i;
            bVar.f37107o = c0094a.f586j;
            bVar.f37108p = c0094a.f588k;
            bVar.f37109q = c0094a.f590l;
            bVar.f37110r = c0094a.f596p;
            bVar.f37111s = c0094a.f597q;
            bVar.f37112t = c0094a.f598r;
            bVar.f37113u = c0094a.f599s;
            bVar.f37114v = c0094a.f606z;
            bVar.f37115w = c0094a.f542A;
            bVar.f37116x = c0094a.f543B;
            bVar.f37117y = c0094a.f592m;
            bVar.f37118z = c0094a.f594n;
            bVar.f37057A = c0094a.f595o;
            bVar.f37058B = c0094a.f558Q;
            bVar.f37059C = c0094a.f559R;
            bVar.f37060D = c0094a.f560S;
            bVar.f37096h = c0094a.f572c;
            bVar.f37092f = c0094a.f568a;
            bVar.f37094g = c0094a.f570b;
            b bVar2 = this.f37053d;
            bVar2.f37088d = ((ViewGroup.MarginLayoutParams) c0094a).width;
            bVar2.f37090e = ((ViewGroup.MarginLayoutParams) c0094a).height;
            bVar2.f37061E = ((ViewGroup.MarginLayoutParams) c0094a).leftMargin;
            bVar2.f37062F = ((ViewGroup.MarginLayoutParams) c0094a).rightMargin;
            bVar2.f37063G = ((ViewGroup.MarginLayoutParams) c0094a).topMargin;
            bVar2.f37064H = ((ViewGroup.MarginLayoutParams) c0094a).bottomMargin;
            bVar2.f37073Q = c0094a.f547F;
            bVar2.f37074R = c0094a.f546E;
            bVar2.f37076T = c0094a.f549H;
            bVar2.f37075S = c0094a.f548G;
            bVar2.f37099i0 = c0094a.f561T;
            bVar2.f37101j0 = c0094a.f562U;
            bVar2.f37077U = c0094a.f550I;
            bVar2.f37078V = c0094a.f551J;
            bVar2.f37079W = c0094a.f554M;
            bVar2.f37080X = c0094a.f555N;
            bVar2.f37081Y = c0094a.f552K;
            bVar2.f37082Z = c0094a.f553L;
            bVar2.f37083a0 = c0094a.f556O;
            bVar2.f37085b0 = c0094a.f557P;
            bVar2.f37097h0 = c0094a.f563V;
            bVar2.f37068L = c0094a.f601u;
            bVar2.f37070N = c0094a.f603w;
            bVar2.f37067K = c0094a.f600t;
            bVar2.f37069M = c0094a.f602v;
            b bVar3 = this.f37053d;
            bVar3.f37072P = c0094a.f604x;
            bVar3.f37071O = c0094a.f605y;
            bVar3.f37065I = c0094a.getMarginEnd();
            this.f37053d.f37066J = c0094a.getMarginStart();
        }

        /* JADX INFO: renamed from: c */
        public final void m15857c(int i, Constraints.a aVar) {
            m15856b(i, aVar);
            this.f37051b.f37130d = aVar.f37147n0;
            e eVar = this.f37054e;
            eVar.f37134c = aVar.f37150q0;
            eVar.f37135d = aVar.f37151r0;
            eVar.f37136e = aVar.f37152s0;
            eVar.f37137f = aVar.f37153t0;
            eVar.f37138g = aVar.f37154u0;
            eVar.f37139h = aVar.f37155v0;
            eVar.f37140i = aVar.f37156w0;
            eVar.f37141j = aVar.f37157x0;
            eVar.f37142k = aVar.f37158y0;
            eVar.f37143l = aVar.f37159z0;
            eVar.f37145n = aVar.f37149p0;
            eVar.f37144m = aVar.f37148o0;
        }

        public Object clone() throws CloneNotSupportedException {
            a aVar = new a();
            b bVar = aVar.f37053d;
            b bVar2 = this.f37053d;
            Objects.requireNonNull(bVar);
            bVar.f37084b = bVar2.f37084b;
            bVar.f37088d = bVar2.f37088d;
            bVar.f37086c = bVar2.f37086c;
            bVar.f37090e = bVar2.f37090e;
            bVar.f37092f = bVar2.f37092f;
            bVar.f37094g = bVar2.f37094g;
            bVar.f37096h = bVar2.f37096h;
            bVar.f37098i = bVar2.f37098i;
            bVar.f37100j = bVar2.f37100j;
            bVar.f37102k = bVar2.f37102k;
            bVar.f37104l = bVar2.f37104l;
            bVar.f37105m = bVar2.f37105m;
            bVar.f37106n = bVar2.f37106n;
            bVar.f37107o = bVar2.f37107o;
            bVar.f37108p = bVar2.f37108p;
            bVar.f37109q = bVar2.f37109q;
            bVar.f37110r = bVar2.f37110r;
            bVar.f37111s = bVar2.f37111s;
            bVar.f37112t = bVar2.f37112t;
            bVar.f37113u = bVar2.f37113u;
            bVar.f37114v = bVar2.f37114v;
            bVar.f37115w = bVar2.f37115w;
            bVar.f37116x = bVar2.f37116x;
            bVar.f37117y = bVar2.f37117y;
            bVar.f37118z = bVar2.f37118z;
            bVar.f37057A = bVar2.f37057A;
            bVar.f37058B = bVar2.f37058B;
            bVar.f37059C = bVar2.f37059C;
            bVar.f37060D = bVar2.f37060D;
            bVar.f37061E = bVar2.f37061E;
            bVar.f37062F = bVar2.f37062F;
            bVar.f37063G = bVar2.f37063G;
            bVar.f37064H = bVar2.f37064H;
            bVar.f37065I = bVar2.f37065I;
            bVar.f37066J = bVar2.f37066J;
            bVar.f37067K = bVar2.f37067K;
            bVar.f37068L = bVar2.f37068L;
            bVar.f37069M = bVar2.f37069M;
            bVar.f37070N = bVar2.f37070N;
            bVar.f37071O = bVar2.f37071O;
            bVar.f37072P = bVar2.f37072P;
            bVar.f37073Q = bVar2.f37073Q;
            bVar.f37074R = bVar2.f37074R;
            bVar.f37075S = bVar2.f37075S;
            bVar.f37076T = bVar2.f37076T;
            bVar.f37077U = bVar2.f37077U;
            bVar.f37078V = bVar2.f37078V;
            bVar.f37079W = bVar2.f37079W;
            bVar.f37080X = bVar2.f37080X;
            bVar.f37081Y = bVar2.f37081Y;
            bVar.f37082Z = bVar2.f37082Z;
            bVar.f37083a0 = bVar2.f37083a0;
            bVar.f37085b0 = bVar2.f37085b0;
            bVar.f37087c0 = bVar2.f37087c0;
            bVar.f37089d0 = bVar2.f37089d0;
            bVar.f37091e0 = bVar2.f37091e0;
            bVar.f37097h0 = bVar2.f37097h0;
            int[] iArr = bVar2.f37093f0;
            if (iArr != null) {
                bVar.f37093f0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                bVar.f37093f0 = null;
            }
            bVar.f37095g0 = bVar2.f37095g0;
            bVar.f37099i0 = bVar2.f37099i0;
            bVar.f37101j0 = bVar2.f37101j0;
            bVar.f37103k0 = bVar2.f37103k0;
            c cVar = aVar.f37052c;
            c cVar2 = this.f37052c;
            Objects.requireNonNull(cVar);
            cVar.f37120b = cVar2.f37120b;
            cVar.f37121c = cVar2.f37121c;
            cVar.f37122d = cVar2.f37122d;
            cVar.f37123e = cVar2.f37123e;
            cVar.f37124f = cVar2.f37124f;
            cVar.f37126h = cVar2.f37126h;
            cVar.f37125g = cVar2.f37125g;
            d dVar = aVar.f37051b;
            d dVar2 = this.f37051b;
            Objects.requireNonNull(dVar);
            dVar.f37127a = dVar2.f37127a;
            dVar.f37128b = dVar2.f37128b;
            dVar.f37130d = dVar2.f37130d;
            dVar.f37131e = dVar2.f37131e;
            dVar.f37129c = dVar2.f37129c;
            e eVar = aVar.f37054e;
            e eVar2 = this.f37054e;
            Objects.requireNonNull(eVar);
            eVar.f37133b = eVar2.f37133b;
            eVar.f37134c = eVar2.f37134c;
            eVar.f37135d = eVar2.f37135d;
            eVar.f37136e = eVar2.f37136e;
            eVar.f37137f = eVar2.f37137f;
            eVar.f37138g = eVar2.f37138g;
            eVar.f37139h = eVar2.f37139h;
            eVar.f37140i = eVar2.f37140i;
            eVar.f37141j = eVar2.f37141j;
            eVar.f37142k = eVar2.f37142k;
            eVar.f37143l = eVar2.f37143l;
            eVar.f37144m = eVar2.f37144m;
            eVar.f37145n = eVar2.f37145n;
            aVar.f37050a = this.f37050a;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: z0.i.c.d$b */
    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static SparseIntArray f37056a;

        /* JADX INFO: renamed from: d */
        public int f37088d;

        /* JADX INFO: renamed from: e */
        public int f37090e;

        /* JADX INFO: renamed from: f0 */
        public int[] f37093f0;

        /* JADX INFO: renamed from: g0 */
        public String f37095g0;

        /* JADX INFO: renamed from: h0 */
        public String f37097h0;

        /* JADX INFO: renamed from: b */
        public boolean f37084b = false;

        /* JADX INFO: renamed from: c */
        public boolean f37086c = false;

        /* JADX INFO: renamed from: f */
        public int f37092f = -1;

        /* JADX INFO: renamed from: g */
        public int f37094g = -1;

        /* JADX INFO: renamed from: h */
        public float f37096h = -1.0f;

        /* JADX INFO: renamed from: i */
        public int f37098i = -1;

        /* JADX INFO: renamed from: j */
        public int f37100j = -1;

        /* JADX INFO: renamed from: k */
        public int f37102k = -1;

        /* JADX INFO: renamed from: l */
        public int f37104l = -1;

        /* JADX INFO: renamed from: m */
        public int f37105m = -1;

        /* JADX INFO: renamed from: n */
        public int f37106n = -1;

        /* JADX INFO: renamed from: o */
        public int f37107o = -1;

        /* JADX INFO: renamed from: p */
        public int f37108p = -1;

        /* JADX INFO: renamed from: q */
        public int f37109q = -1;

        /* JADX INFO: renamed from: r */
        public int f37110r = -1;

        /* JADX INFO: renamed from: s */
        public int f37111s = -1;

        /* JADX INFO: renamed from: t */
        public int f37112t = -1;

        /* JADX INFO: renamed from: u */
        public int f37113u = -1;

        /* JADX INFO: renamed from: v */
        public float f37114v = 0.5f;

        /* JADX INFO: renamed from: w */
        public float f37115w = 0.5f;

        /* JADX INFO: renamed from: x */
        public String f37116x = null;

        /* JADX INFO: renamed from: y */
        public int f37117y = -1;

        /* JADX INFO: renamed from: z */
        public int f37118z = 0;

        /* JADX INFO: renamed from: A */
        public float f37057A = 0.0f;

        /* JADX INFO: renamed from: B */
        public int f37058B = -1;

        /* JADX INFO: renamed from: C */
        public int f37059C = -1;

        /* JADX INFO: renamed from: D */
        public int f37060D = -1;

        /* JADX INFO: renamed from: E */
        public int f37061E = -1;

        /* JADX INFO: renamed from: F */
        public int f37062F = -1;

        /* JADX INFO: renamed from: G */
        public int f37063G = -1;

        /* JADX INFO: renamed from: H */
        public int f37064H = -1;

        /* JADX INFO: renamed from: I */
        public int f37065I = -1;

        /* JADX INFO: renamed from: J */
        public int f37066J = -1;

        /* JADX INFO: renamed from: K */
        public int f37067K = -1;

        /* JADX INFO: renamed from: L */
        public int f37068L = -1;

        /* JADX INFO: renamed from: M */
        public int f37069M = -1;

        /* JADX INFO: renamed from: N */
        public int f37070N = -1;

        /* JADX INFO: renamed from: O */
        public int f37071O = -1;

        /* JADX INFO: renamed from: P */
        public int f37072P = -1;

        /* JADX INFO: renamed from: Q */
        public float f37073Q = -1.0f;

        /* JADX INFO: renamed from: R */
        public float f37074R = -1.0f;

        /* JADX INFO: renamed from: S */
        public int f37075S = 0;

        /* JADX INFO: renamed from: T */
        public int f37076T = 0;

        /* JADX INFO: renamed from: U */
        public int f37077U = 0;

        /* JADX INFO: renamed from: V */
        public int f37078V = 0;

        /* JADX INFO: renamed from: W */
        public int f37079W = -1;

        /* JADX INFO: renamed from: X */
        public int f37080X = -1;

        /* JADX INFO: renamed from: Y */
        public int f37081Y = -1;

        /* JADX INFO: renamed from: Z */
        public int f37082Z = -1;

        /* JADX INFO: renamed from: a0 */
        public float f37083a0 = 1.0f;

        /* JADX INFO: renamed from: b0 */
        public float f37085b0 = 1.0f;

        /* JADX INFO: renamed from: c0 */
        public int f37087c0 = -1;

        /* JADX INFO: renamed from: d0 */
        public int f37089d0 = 0;

        /* JADX INFO: renamed from: e0 */
        public int f37091e0 = -1;

        /* JADX INFO: renamed from: i0 */
        public boolean f37099i0 = false;

        /* JADX INFO: renamed from: j0 */
        public boolean f37101j0 = false;

        /* JADX INFO: renamed from: k0 */
        public boolean f37103k0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f37056a = sparseIntArray;
            sparseIntArray.append(39, 24);
            f37056a.append(40, 25);
            f37056a.append(42, 28);
            f37056a.append(43, 29);
            f37056a.append(48, 35);
            f37056a.append(47, 34);
            f37056a.append(21, 4);
            f37056a.append(20, 3);
            f37056a.append(18, 1);
            f37056a.append(56, 6);
            f37056a.append(57, 7);
            f37056a.append(28, 17);
            f37056a.append(29, 18);
            f37056a.append(30, 19);
            f37056a.append(0, 26);
            f37056a.append(44, 31);
            f37056a.append(45, 32);
            f37056a.append(27, 10);
            f37056a.append(26, 9);
            f37056a.append(60, 13);
            f37056a.append(63, 16);
            f37056a.append(61, 14);
            f37056a.append(58, 11);
            f37056a.append(62, 15);
            f37056a.append(59, 12);
            f37056a.append(51, 38);
            f37056a.append(37, 37);
            f37056a.append(36, 39);
            f37056a.append(50, 40);
            f37056a.append(35, 20);
            f37056a.append(49, 36);
            f37056a.append(25, 5);
            f37056a.append(38, 76);
            f37056a.append(46, 76);
            f37056a.append(41, 76);
            f37056a.append(19, 76);
            f37056a.append(17, 76);
            f37056a.append(3, 23);
            f37056a.append(5, 27);
            f37056a.append(7, 30);
            f37056a.append(8, 8);
            f37056a.append(4, 33);
            f37056a.append(6, 2);
            f37056a.append(1, 22);
            f37056a.append(2, 21);
            f37056a.append(22, 61);
            f37056a.append(24, 62);
            f37056a.append(23, 63);
            f37056a.append(55, 69);
            f37056a.append(34, 70);
            f37056a.append(12, 71);
            f37056a.append(10, 72);
            f37056a.append(11, 73);
            f37056a.append(13, 74);
            f37056a.append(9, 75);
        }

        /* JADX INFO: renamed from: a */
        public void m15858a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8022i.f37168f);
            this.f37086c = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = f37056a.get(index);
                if (i2 == 80) {
                    this.f37099i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f37099i0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            int i3 = this.f37109q;
                            int[] iArr = ConstraintSet.f37045a;
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, i3);
                            if (resourceId == -1) {
                                resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f37109q = resourceId;
                            break;
                        case 2:
                            this.f37064H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37064H);
                            break;
                        case 3:
                            int i4 = this.f37108p;
                            int[] iArr2 = ConstraintSet.f37045a;
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, i4);
                            if (resourceId2 == -1) {
                                resourceId2 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f37108p = resourceId2;
                            break;
                        case 4:
                            int i5 = this.f37107o;
                            int[] iArr3 = ConstraintSet.f37045a;
                            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, i5);
                            if (resourceId3 == -1) {
                                resourceId3 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f37107o = resourceId3;
                            break;
                        case 5:
                            this.f37116x = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f37058B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f37058B);
                            break;
                        case 7:
                            this.f37059C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f37059C);
                            break;
                        case 8:
                            this.f37065I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37065I);
                            break;
                        case 9:
                            int i6 = this.f37113u;
                            int[] iArr4 = ConstraintSet.f37045a;
                            int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, i6);
                            if (resourceId4 == -1) {
                                resourceId4 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f37113u = resourceId4;
                            break;
                        case 10:
                            int i7 = this.f37112t;
                            int[] iArr5 = ConstraintSet.f37045a;
                            int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, i7);
                            if (resourceId5 == -1) {
                                resourceId5 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f37112t = resourceId5;
                            break;
                        case 11:
                            this.f37070N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37070N);
                            break;
                        case 12:
                            this.f37071O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37071O);
                            break;
                        case 13:
                            this.f37067K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37067K);
                            break;
                        case 14:
                            this.f37069M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37069M);
                            break;
                        case 15:
                            this.f37072P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37072P);
                            break;
                        case 16:
                            this.f37068L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37068L);
                            break;
                        case 17:
                            this.f37092f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f37092f);
                            break;
                        case 18:
                            this.f37094g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f37094g);
                            break;
                        case 19:
                            this.f37096h = typedArrayObtainStyledAttributes.getFloat(index, this.f37096h);
                            break;
                        case 20:
                            this.f37114v = typedArrayObtainStyledAttributes.getFloat(index, this.f37114v);
                            break;
                        case 21:
                            this.f37090e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f37090e);
                            break;
                        case 22:
                            this.f37088d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f37088d);
                            break;
                        case 23:
                            this.f37061E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37061E);
                            break;
                        case 24:
                            int i8 = this.f37098i;
                            int[] iArr6 = ConstraintSet.f37045a;
                            int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, i8);
                            if (resourceId6 == -1) {
                                resourceId6 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f37098i = resourceId6;
                            break;
                        case 25:
                            int i9 = this.f37100j;
                            int[] iArr7 = ConstraintSet.f37045a;
                            int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, i9);
                            if (resourceId7 == -1) {
                                resourceId7 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f37100j = resourceId7;
                            break;
                        case 26:
                            this.f37060D = typedArrayObtainStyledAttributes.getInt(index, this.f37060D);
                            break;
                        case 27:
                            this.f37062F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37062F);
                            break;
                        case 28:
                            int i10 = this.f37102k;
                            int[] iArr8 = ConstraintSet.f37045a;
                            int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, i10);
                            if (resourceId8 == -1) {
                                resourceId8 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f37102k = resourceId8;
                            break;
                        case 29:
                            int i11 = this.f37104l;
                            int[] iArr9 = ConstraintSet.f37045a;
                            int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, i11);
                            if (resourceId9 == -1) {
                                resourceId9 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f37104l = resourceId9;
                            break;
                        case 30:
                            this.f37066J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37066J);
                            break;
                        case 31:
                            int i12 = this.f37110r;
                            int[] iArr10 = ConstraintSet.f37045a;
                            int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, i12);
                            if (resourceId10 == -1) {
                                resourceId10 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f37110r = resourceId10;
                            break;
                        case 32:
                            int i13 = this.f37111s;
                            int[] iArr11 = ConstraintSet.f37045a;
                            int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, i13);
                            if (resourceId11 == -1) {
                                resourceId11 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f37111s = resourceId11;
                            break;
                        case 33:
                            this.f37063G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37063G);
                            break;
                        case 34:
                            int i14 = this.f37106n;
                            int[] iArr12 = ConstraintSet.f37045a;
                            int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, i14);
                            if (resourceId12 == -1) {
                                resourceId12 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f37106n = resourceId12;
                            break;
                        case 35:
                            int i15 = this.f37105m;
                            int[] iArr13 = ConstraintSet.f37045a;
                            int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, i15);
                            if (resourceId13 == -1) {
                                resourceId13 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            this.f37105m = resourceId13;
                            break;
                        case 36:
                            this.f37115w = typedArrayObtainStyledAttributes.getFloat(index, this.f37115w);
                            break;
                        case 37:
                            this.f37074R = typedArrayObtainStyledAttributes.getFloat(index, this.f37074R);
                            break;
                        case 38:
                            this.f37073Q = typedArrayObtainStyledAttributes.getFloat(index, this.f37073Q);
                            break;
                        case 39:
                            this.f37075S = typedArrayObtainStyledAttributes.getInt(index, this.f37075S);
                            break;
                        case 40:
                            this.f37076T = typedArrayObtainStyledAttributes.getInt(index, this.f37076T);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f37077U = typedArrayObtainStyledAttributes.getInt(index, this.f37077U);
                                    break;
                                case 55:
                                    this.f37078V = typedArrayObtainStyledAttributes.getInt(index, this.f37078V);
                                    break;
                                case 56:
                                    this.f37079W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37079W);
                                    break;
                                case 57:
                                    this.f37080X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37080X);
                                    break;
                                case 58:
                                    this.f37081Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37081Y);
                                    break;
                                case 59:
                                    this.f37082Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37082Z);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            int i16 = this.f37117y;
                                            int[] iArr14 = ConstraintSet.f37045a;
                                            int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, i16);
                                            if (resourceId14 == -1) {
                                                resourceId14 = typedArrayObtainStyledAttributes.getInt(index, -1);
                                            }
                                            this.f37117y = resourceId14;
                                            break;
                                        case 62:
                                            this.f37118z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37118z);
                                            break;
                                        case 63:
                                            this.f37057A = typedArrayObtainStyledAttributes.getFloat(index, this.f37057A);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f37083a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f37085b0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f37087c0 = typedArrayObtainStyledAttributes.getInt(index, this.f37087c0);
                                                    break;
                                                case 73:
                                                    this.f37089d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f37089d0);
                                                    break;
                                                case 74:
                                                    this.f37095g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f37103k0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f37103k0);
                                                    break;
                                                case 76:
                                                    StringBuilder sbM1556G = outline.m1556G("unused attribute 0x");
                                                    sbM1556G.append(Integer.toHexString(index));
                                                    sbM1556G.append("   ");
                                                    sbM1556G.append(f37056a.get(index));
                                                    Log.w("ConstraintSet", sbM1556G.toString());
                                                    break;
                                                case 77:
                                                    this.f37097h0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    StringBuilder sbM1556G2 = outline.m1556G("Unknown attribute 0x");
                                                    sbM1556G2.append(Integer.toHexString(index));
                                                    sbM1556G2.append("   ");
                                                    sbM1556G2.append(f37056a.get(index));
                                                    Log.w("ConstraintSet", sbM1556G2.toString());
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.f37101j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f37101j0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: z0.i.c.d$c */
    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static SparseIntArray f37119a;

        /* JADX INFO: renamed from: b */
        public boolean f37120b = false;

        /* JADX INFO: renamed from: c */
        public int f37121c = -1;

        /* JADX INFO: renamed from: d */
        public String f37122d = null;

        /* JADX INFO: renamed from: e */
        public int f37123e = -1;

        /* JADX INFO: renamed from: f */
        public int f37124f = 0;

        /* JADX INFO: renamed from: g */
        public float f37125g = Float.NaN;

        /* JADX INFO: renamed from: h */
        public float f37126h = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f37119a = sparseIntArray;
            sparseIntArray.append(2, 1);
            f37119a.append(4, 2);
            f37119a.append(5, 3);
            f37119a.append(1, 4);
            f37119a.append(0, 5);
            f37119a.append(3, 6);
        }

        /* JADX INFO: renamed from: a */
        public void m15859a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8022i.f37169g);
            this.f37120b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f37119a.get(index)) {
                    case 1:
                        this.f37126h = typedArrayObtainStyledAttributes.getFloat(index, this.f37126h);
                        break;
                    case 2:
                        this.f37123e = typedArrayObtainStyledAttributes.getInt(index, this.f37123e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f37122d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f37122d = Easing.f36716a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f37124f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i2 = this.f37121c;
                        int[] iArr = ConstraintSet.f37045a;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, i2);
                        if (resourceId == -1) {
                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        this.f37121c = resourceId;
                        break;
                    case 6:
                        this.f37125g = typedArrayObtainStyledAttributes.getFloat(index, this.f37125g);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: z0.i.c.d$d */
    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class d {

        /* JADX INFO: renamed from: a */
        public boolean f37127a = false;

        /* JADX INFO: renamed from: b */
        public int f37128b = 0;

        /* JADX INFO: renamed from: c */
        public int f37129c = 0;

        /* JADX INFO: renamed from: d */
        public float f37130d = 1.0f;

        /* JADX INFO: renamed from: e */
        public float f37131e = Float.NaN;

        /* JADX INFO: renamed from: a */
        public void m15860a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8022i.f37170h);
            this.f37127a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f37130d = typedArrayObtainStyledAttributes.getFloat(index, this.f37130d);
                } else if (index == 0) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f37128b);
                    this.f37128b = i2;
                    int[] iArr = ConstraintSet.f37045a;
                    this.f37128b = ConstraintSet.f37045a[i2];
                } else if (index == 4) {
                    this.f37129c = typedArrayObtainStyledAttributes.getInt(index, this.f37129c);
                } else if (index == 3) {
                    this.f37131e = typedArrayObtainStyledAttributes.getFloat(index, this.f37131e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: z0.i.c.d$e */
    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class e {

        /* JADX INFO: renamed from: a */
        public static SparseIntArray f37132a;

        /* JADX INFO: renamed from: b */
        public boolean f37133b = false;

        /* JADX INFO: renamed from: c */
        public float f37134c = 0.0f;

        /* JADX INFO: renamed from: d */
        public float f37135d = 0.0f;

        /* JADX INFO: renamed from: e */
        public float f37136e = 0.0f;

        /* JADX INFO: renamed from: f */
        public float f37137f = 1.0f;

        /* JADX INFO: renamed from: g */
        public float f37138g = 1.0f;

        /* JADX INFO: renamed from: h */
        public float f37139h = Float.NaN;

        /* JADX INFO: renamed from: i */
        public float f37140i = Float.NaN;

        /* JADX INFO: renamed from: j */
        public float f37141j = 0.0f;

        /* JADX INFO: renamed from: k */
        public float f37142k = 0.0f;

        /* JADX INFO: renamed from: l */
        public float f37143l = 0.0f;

        /* JADX INFO: renamed from: m */
        public boolean f37144m = false;

        /* JADX INFO: renamed from: n */
        public float f37145n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f37132a = sparseIntArray;
            sparseIntArray.append(6, 1);
            f37132a.append(7, 2);
            f37132a.append(8, 3);
            f37132a.append(4, 4);
            f37132a.append(5, 5);
            f37132a.append(0, 6);
            f37132a.append(1, 7);
            f37132a.append(2, 8);
            f37132a.append(3, 9);
            f37132a.append(9, 10);
            f37132a.append(10, 11);
        }

        /* JADX INFO: renamed from: a */
        public void m15861a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8022i.f37172j);
            this.f37133b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f37132a.get(index)) {
                    case 1:
                        this.f37134c = typedArrayObtainStyledAttributes.getFloat(index, this.f37134c);
                        break;
                    case 2:
                        this.f37135d = typedArrayObtainStyledAttributes.getFloat(index, this.f37135d);
                        break;
                    case 3:
                        this.f37136e = typedArrayObtainStyledAttributes.getFloat(index, this.f37136e);
                        break;
                    case 4:
                        this.f37137f = typedArrayObtainStyledAttributes.getFloat(index, this.f37137f);
                        break;
                    case 5:
                        this.f37138g = typedArrayObtainStyledAttributes.getFloat(index, this.f37138g);
                        break;
                    case 6:
                        this.f37139h = typedArrayObtainStyledAttributes.getDimension(index, this.f37139h);
                        break;
                    case 7:
                        this.f37140i = typedArrayObtainStyledAttributes.getDimension(index, this.f37140i);
                        break;
                    case 8:
                        this.f37141j = typedArrayObtainStyledAttributes.getDimension(index, this.f37141j);
                        break;
                    case 9:
                        this.f37142k = typedArrayObtainStyledAttributes.getDimension(index, this.f37142k);
                        break;
                    case 10:
                        this.f37143l = typedArrayObtainStyledAttributes.getDimension(index, this.f37143l);
                        break;
                    case 11:
                        this.f37144m = true;
                        this.f37145n = typedArrayObtainStyledAttributes.getDimension(index, this.f37145n);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f37046b = sparseIntArray;
        sparseIntArray.append(77, 25);
        f37046b.append(78, 26);
        f37046b.append(80, 29);
        f37046b.append(81, 30);
        f37046b.append(87, 36);
        f37046b.append(86, 35);
        f37046b.append(59, 4);
        f37046b.append(58, 3);
        f37046b.append(56, 1);
        f37046b.append(95, 6);
        f37046b.append(96, 7);
        f37046b.append(66, 17);
        f37046b.append(67, 18);
        f37046b.append(68, 19);
        f37046b.append(0, 27);
        f37046b.append(82, 32);
        f37046b.append(83, 33);
        f37046b.append(65, 10);
        f37046b.append(64, 9);
        f37046b.append(99, 13);
        f37046b.append(102, 16);
        f37046b.append(100, 14);
        f37046b.append(97, 11);
        f37046b.append(101, 15);
        f37046b.append(98, 12);
        f37046b.append(90, 40);
        f37046b.append(75, 39);
        f37046b.append(74, 41);
        f37046b.append(89, 42);
        f37046b.append(73, 20);
        f37046b.append(88, 37);
        f37046b.append(63, 5);
        f37046b.append(76, 82);
        f37046b.append(85, 82);
        f37046b.append(79, 82);
        f37046b.append(57, 82);
        f37046b.append(55, 82);
        f37046b.append(5, 24);
        f37046b.append(7, 28);
        f37046b.append(23, 31);
        f37046b.append(24, 8);
        f37046b.append(6, 34);
        f37046b.append(8, 2);
        f37046b.append(3, 23);
        f37046b.append(4, 21);
        f37046b.append(2, 22);
        f37046b.append(13, 43);
        f37046b.append(26, 44);
        f37046b.append(21, 45);
        f37046b.append(22, 46);
        f37046b.append(20, 60);
        f37046b.append(18, 47);
        f37046b.append(19, 48);
        f37046b.append(14, 49);
        f37046b.append(15, 50);
        f37046b.append(16, 51);
        f37046b.append(17, 52);
        f37046b.append(25, 53);
        f37046b.append(91, 54);
        f37046b.append(69, 55);
        f37046b.append(92, 56);
        f37046b.append(70, 57);
        f37046b.append(93, 58);
        f37046b.append(71, 59);
        f37046b.append(60, 61);
        f37046b.append(62, 62);
        f37046b.append(61, 63);
        f37046b.append(27, 64);
        f37046b.append(107, 65);
        f37046b.append(34, 66);
        f37046b.append(108, 67);
        f37046b.append(104, 79);
        f37046b.append(1, 38);
        f37046b.append(103, 68);
        f37046b.append(94, 69);
        f37046b.append(72, 70);
        f37046b.append(31, 71);
        f37046b.append(29, 72);
        f37046b.append(30, 73);
        f37046b.append(32, 74);
        f37046b.append(28, 75);
        f37046b.append(105, 76);
        f37046b.append(84, 77);
        f37046b.append(109, 78);
        f37046b.append(54, 80);
        f37046b.append(53, 81);
    }

    /* JADX INFO: renamed from: a */
    public void m15850a(ConstraintLayout constraintLayout, boolean z) {
        int i;
        Iterator<String> it;
        String resourceEntryName;
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f37049e.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.f37049e.containsKey(Integer.valueOf(id))) {
                StringBuilder sbM1556G = outline.m1556G("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                outline.m1571V(sbM1556G, resourceEntryName, "ConstraintSet");
            } else {
                if (this.f37048d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f37049e.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f37049e.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.f37053d.f37091e0 = 1;
                        }
                        int i3 = aVar.f37053d.f37091e0;
                        if (i3 != -1 && i3 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f37053d.f37087c0);
                            barrier.setMargin(aVar.f37053d.f37089d0);
                            barrier.setAllowsGoneWidget(aVar.f37053d.f37103k0);
                            b bVar = aVar.f37053d;
                            int[] iArr = bVar.f37093f0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f37095g0;
                                if (str != null) {
                                    bVar.f37093f0 = m15852c(barrier, str);
                                    barrier.setReferencedIds(aVar.f37053d.f37093f0);
                                }
                            }
                        }
                        ConstraintLayout.C0094a c0094a = (ConstraintLayout.C0094a) childAt.getLayoutParams();
                        c0094a.m284a();
                        aVar.m15855a(c0094a);
                        if (z) {
                            HashMap<String, ConstraintAttribute> map = aVar.f37055f;
                            Class<?> cls = childAt.getClass();
                            Iterator<String> it2 = map.keySet().iterator();
                            while (it2.hasNext()) {
                                String next = it2.next();
                                ConstraintAttribute constraintAttribute = map.get(next);
                                int i4 = childCount;
                                String strM1599u = outline.m1599u("set", next);
                                HashMap<String, ConstraintAttribute> map2 = map;
                                try {
                                    switch (constraintAttribute.f37012b.ordinal()) {
                                        case 0:
                                            it = it2;
                                            cls.getMethod(strM1599u, Integer.TYPE).invoke(childAt, Integer.valueOf(constraintAttribute.f37013c));
                                            break;
                                        case 1:
                                            it = it2;
                                            cls.getMethod(strM1599u, Float.TYPE).invoke(childAt, Float.valueOf(constraintAttribute.f37014d));
                                            break;
                                        case 2:
                                            it = it2;
                                            cls.getMethod(strM1599u, Integer.TYPE).invoke(childAt, Integer.valueOf(constraintAttribute.f37017g));
                                            break;
                                        case 3:
                                            it = it2;
                                            Method method = cls.getMethod(strM1599u, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(constraintAttribute.f37017g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            it = it2;
                                            cls.getMethod(strM1599u, CharSequence.class).invoke(childAt, constraintAttribute.f37015e);
                                            break;
                                        case 5:
                                            it = it2;
                                            cls.getMethod(strM1599u, Boolean.TYPE).invoke(childAt, Boolean.valueOf(constraintAttribute.f37016f));
                                            break;
                                        case 6:
                                            it = it2;
                                            try {
                                                cls.getMethod(strM1599u, Float.TYPE).invoke(childAt, Float.valueOf(constraintAttribute.f37014d));
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder sbM1562M = outline.m1562M(" Custom Attribute \"", next, "\" not found on ");
                                                sbM1562M.append(cls.getName());
                                                Log.e("TransitionLayout", sbM1562M.toString());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(cls.getName());
                                                sb.append(" must have a method ");
                                                sb.append(strM1599u);
                                                Log.e("TransitionLayout", sb.toString());
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                StringBuilder sbM1562M2 = outline.m1562M(" Custom Attribute \"", next, "\" not found on ");
                                                sbM1562M2.append(cls.getName());
                                                Log.e("TransitionLayout", sbM1562M2.toString());
                                                e.printStackTrace();
                                            }
                                            break;
                                        default:
                                            it = it2;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    it = it2;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    it = it2;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    it = it2;
                                }
                                childCount = i4;
                                map = map2;
                                it2 = it;
                            }
                        }
                        i = childCount;
                        childAt.setLayoutParams(c0094a);
                        d dVar = aVar.f37051b;
                        if (dVar.f37129c == 0) {
                            childAt.setVisibility(dVar.f37128b);
                        }
                        childAt.setAlpha(aVar.f37051b.f37130d);
                        childAt.setRotation(aVar.f37054e.f37134c);
                        childAt.setRotationX(aVar.f37054e.f37135d);
                        childAt.setRotationY(aVar.f37054e.f37136e);
                        childAt.setScaleX(aVar.f37054e.f37137f);
                        childAt.setScaleY(aVar.f37054e.f37138g);
                        if (!Float.isNaN(aVar.f37054e.f37139h)) {
                            childAt.setPivotX(aVar.f37054e.f37139h);
                        }
                        if (!Float.isNaN(aVar.f37054e.f37140i)) {
                            childAt.setPivotY(aVar.f37054e.f37140i);
                        }
                        childAt.setTranslationX(aVar.f37054e.f37141j);
                        childAt.setTranslationY(aVar.f37054e.f37142k);
                        childAt.setTranslationZ(aVar.f37054e.f37143l);
                        e eVar = aVar.f37054e;
                        if (eVar.f37144m) {
                            childAt.setElevation(eVar.f37145n);
                        }
                    } else {
                        i = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i2++;
                childCount = i;
            }
            i = childCount;
            i2++;
            childCount = i;
        }
        for (Integer num : hashSet) {
            a aVar2 = this.f37049e.get(num);
            int i5 = aVar2.f37053d.f37091e0;
            if (i5 != -1 && i5 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar2 = aVar2.f37053d;
                int[] iArr2 = bVar2.f37093f0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f37095g0;
                    if (str2 != null) {
                        bVar2.f37093f0 = m15852c(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f37053d.f37093f0);
                    }
                }
                barrier2.setType(aVar2.f37053d.f37087c0);
                barrier2.setMargin(aVar2.f37053d.f37089d0);
                ConstraintLayout.C0094a c0094aGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.m15848k();
                aVar2.m15855a(c0094aGenerateDefaultLayoutParams);
                constraintLayout.addView(barrier2, c0094aGenerateDefaultLayoutParams);
            }
            if (aVar2.f37053d.f37084b) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.C0094a c0094aGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.m15855a(c0094aGenerateDefaultLayoutParams2);
                constraintLayout.addView(guideline, c0094aGenerateDefaultLayoutParams2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15851b(ConstraintLayout constraintLayout) {
        ConstraintSet constraintSet = this;
        int childCount = constraintLayout.getChildCount();
        constraintSet.f37049e.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C0094a c0094a = (ConstraintLayout.C0094a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (constraintSet.f37048d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!constraintSet.f37049e.containsKey(Integer.valueOf(id))) {
                constraintSet.f37049e.put(Integer.valueOf(id), new a());
            }
            a aVar = constraintSet.f37049e.get(Integer.valueOf(id));
            HashMap<String, ConstraintAttribute> map = constraintSet.f37047c;
            HashMap<String, ConstraintAttribute> map2 = new HashMap<>();
            Class<?> cls = childAt.getClass();
            for (String str : map.keySet()) {
                ConstraintAttribute constraintAttribute = map.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map2.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        try {
                            map2.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e2) {
                            e = e2;
                            e.printStackTrace();
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            e.printStackTrace();
                        } catch (InvocationTargetException e4) {
                            e = e4;
                            e.printStackTrace();
                        }
                    }
                } catch (IllegalAccessException e5) {
                    e = e5;
                } catch (NoSuchMethodException e6) {
                    e = e6;
                } catch (InvocationTargetException e7) {
                    e = e7;
                }
            }
            aVar.f37055f = map2;
            aVar.m15856b(id, c0094a);
            aVar.f37051b.f37128b = childAt.getVisibility();
            aVar.f37051b.f37130d = childAt.getAlpha();
            aVar.f37054e.f37134c = childAt.getRotation();
            aVar.f37054e.f37135d = childAt.getRotationX();
            aVar.f37054e.f37136e = childAt.getRotationY();
            aVar.f37054e.f37137f = childAt.getScaleX();
            aVar.f37054e.f37138g = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f37054e;
                eVar.f37139h = pivotX;
                eVar.f37140i = pivotY;
            }
            aVar.f37054e.f37141j = childAt.getTranslationX();
            aVar.f37054e.f37142k = childAt.getTranslationY();
            aVar.f37054e.f37143l = childAt.getTranslationZ();
            e eVar2 = aVar.f37054e;
            if (eVar2.f37144m) {
                eVar2.f37145n = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                b bVar = aVar.f37053d;
                bVar.f37103k0 = barrier.f522o.f36786p0;
                bVar.f37093f0 = barrier.getReferencedIds();
                aVar.f37053d.f37087c0 = barrier.getType();
                aVar.f37053d.f37089d0 = barrier.getMargin();
            }
            i++;
            constraintSet = this;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int[] m15852c(View view, String str) {
        int iIntValue;
        Object objM276c;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = C8021h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objM276c = ((ConstraintLayout) view.getParent()).m276c(0, strTrim)) != null && (objM276c instanceof Integer)) {
                iIntValue = ((Integer) objM276c).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: d */
    public final a m15853d(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8022i.f37163a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index != 1 && 23 != index && 24 != index) {
                aVar.f37052c.f37120b = true;
                aVar.f37053d.f37086c = true;
                aVar.f37051b.f37127a = true;
                aVar.f37054e.f37133b = true;
            }
            switch (f37046b.get(index)) {
                case 1:
                    b bVar = aVar.f37053d;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, bVar.f37109q);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar.f37109q = resourceId;
                    break;
                case 2:
                    b bVar2 = aVar.f37053d;
                    bVar2.f37064H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar2.f37064H);
                    break;
                case 3:
                    b bVar3 = aVar.f37053d;
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, bVar3.f37108p);
                    if (resourceId2 == -1) {
                        resourceId2 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar3.f37108p = resourceId2;
                    break;
                case 4:
                    b bVar4 = aVar.f37053d;
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, bVar4.f37107o);
                    if (resourceId3 == -1) {
                        resourceId3 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar4.f37107o = resourceId3;
                    break;
                case 5:
                    aVar.f37053d.f37116x = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f37053d;
                    bVar5.f37058B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar5.f37058B);
                    break;
                case 7:
                    b bVar6 = aVar.f37053d;
                    bVar6.f37059C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar6.f37059C);
                    break;
                case 8:
                    b bVar7 = aVar.f37053d;
                    bVar7.f37065I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar7.f37065I);
                    break;
                case 9:
                    b bVar8 = aVar.f37053d;
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, bVar8.f37113u);
                    if (resourceId4 == -1) {
                        resourceId4 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar8.f37113u = resourceId4;
                    break;
                case 10:
                    b bVar9 = aVar.f37053d;
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, bVar9.f37112t);
                    if (resourceId5 == -1) {
                        resourceId5 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar9.f37112t = resourceId5;
                    break;
                case 11:
                    b bVar10 = aVar.f37053d;
                    bVar10.f37070N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar10.f37070N);
                    break;
                case 12:
                    b bVar11 = aVar.f37053d;
                    bVar11.f37071O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar11.f37071O);
                    break;
                case 13:
                    b bVar12 = aVar.f37053d;
                    bVar12.f37067K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar12.f37067K);
                    break;
                case 14:
                    b bVar13 = aVar.f37053d;
                    bVar13.f37069M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar13.f37069M);
                    break;
                case 15:
                    b bVar14 = aVar.f37053d;
                    bVar14.f37072P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar14.f37072P);
                    break;
                case 16:
                    b bVar15 = aVar.f37053d;
                    bVar15.f37068L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar15.f37068L);
                    break;
                case 17:
                    b bVar16 = aVar.f37053d;
                    bVar16.f37092f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar16.f37092f);
                    break;
                case 18:
                    b bVar17 = aVar.f37053d;
                    bVar17.f37094g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar17.f37094g);
                    break;
                case 19:
                    b bVar18 = aVar.f37053d;
                    bVar18.f37096h = typedArrayObtainStyledAttributes.getFloat(index, bVar18.f37096h);
                    break;
                case 20:
                    b bVar19 = aVar.f37053d;
                    bVar19.f37114v = typedArrayObtainStyledAttributes.getFloat(index, bVar19.f37114v);
                    break;
                case 21:
                    b bVar20 = aVar.f37053d;
                    bVar20.f37090e = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar20.f37090e);
                    break;
                case 22:
                    d dVar = aVar.f37051b;
                    dVar.f37128b = typedArrayObtainStyledAttributes.getInt(index, dVar.f37128b);
                    d dVar2 = aVar.f37051b;
                    dVar2.f37128b = f37045a[dVar2.f37128b];
                    break;
                case 23:
                    b bVar21 = aVar.f37053d;
                    bVar21.f37088d = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar21.f37088d);
                    break;
                case 24:
                    b bVar22 = aVar.f37053d;
                    bVar22.f37061E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar22.f37061E);
                    break;
                case 25:
                    b bVar23 = aVar.f37053d;
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, bVar23.f37098i);
                    if (resourceId6 == -1) {
                        resourceId6 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar23.f37098i = resourceId6;
                    break;
                case 26:
                    b bVar24 = aVar.f37053d;
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, bVar24.f37100j);
                    if (resourceId7 == -1) {
                        resourceId7 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar24.f37100j = resourceId7;
                    break;
                case 27:
                    b bVar25 = aVar.f37053d;
                    bVar25.f37060D = typedArrayObtainStyledAttributes.getInt(index, bVar25.f37060D);
                    break;
                case 28:
                    b bVar26 = aVar.f37053d;
                    bVar26.f37062F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar26.f37062F);
                    break;
                case 29:
                    b bVar27 = aVar.f37053d;
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, bVar27.f37102k);
                    if (resourceId8 == -1) {
                        resourceId8 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar27.f37102k = resourceId8;
                    break;
                case 30:
                    b bVar28 = aVar.f37053d;
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, bVar28.f37104l);
                    if (resourceId9 == -1) {
                        resourceId9 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar28.f37104l = resourceId9;
                    break;
                case 31:
                    b bVar29 = aVar.f37053d;
                    bVar29.f37066J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar29.f37066J);
                    break;
                case 32:
                    b bVar30 = aVar.f37053d;
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, bVar30.f37110r);
                    if (resourceId10 == -1) {
                        resourceId10 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar30.f37110r = resourceId10;
                    break;
                case 33:
                    b bVar31 = aVar.f37053d;
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, bVar31.f37111s);
                    if (resourceId11 == -1) {
                        resourceId11 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar31.f37111s = resourceId11;
                    break;
                case 34:
                    b bVar32 = aVar.f37053d;
                    bVar32.f37063G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar32.f37063G);
                    break;
                case 35:
                    b bVar33 = aVar.f37053d;
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, bVar33.f37106n);
                    if (resourceId12 == -1) {
                        resourceId12 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar33.f37106n = resourceId12;
                    break;
                case 36:
                    b bVar34 = aVar.f37053d;
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, bVar34.f37105m);
                    if (resourceId13 == -1) {
                        resourceId13 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar34.f37105m = resourceId13;
                    break;
                case 37:
                    b bVar35 = aVar.f37053d;
                    bVar35.f37115w = typedArrayObtainStyledAttributes.getFloat(index, bVar35.f37115w);
                    break;
                case 38:
                    aVar.f37050a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f37050a);
                    break;
                case 39:
                    b bVar36 = aVar.f37053d;
                    bVar36.f37074R = typedArrayObtainStyledAttributes.getFloat(index, bVar36.f37074R);
                    break;
                case 40:
                    b bVar37 = aVar.f37053d;
                    bVar37.f37073Q = typedArrayObtainStyledAttributes.getFloat(index, bVar37.f37073Q);
                    break;
                case 41:
                    b bVar38 = aVar.f37053d;
                    bVar38.f37075S = typedArrayObtainStyledAttributes.getInt(index, bVar38.f37075S);
                    break;
                case 42:
                    b bVar39 = aVar.f37053d;
                    bVar39.f37076T = typedArrayObtainStyledAttributes.getInt(index, bVar39.f37076T);
                    break;
                case 43:
                    d dVar3 = aVar.f37051b;
                    dVar3.f37130d = typedArrayObtainStyledAttributes.getFloat(index, dVar3.f37130d);
                    break;
                case 44:
                    e eVar = aVar.f37054e;
                    eVar.f37144m = true;
                    eVar.f37145n = typedArrayObtainStyledAttributes.getDimension(index, eVar.f37145n);
                    break;
                case 45:
                    e eVar2 = aVar.f37054e;
                    eVar2.f37135d = typedArrayObtainStyledAttributes.getFloat(index, eVar2.f37135d);
                    break;
                case 46:
                    e eVar3 = aVar.f37054e;
                    eVar3.f37136e = typedArrayObtainStyledAttributes.getFloat(index, eVar3.f37136e);
                    break;
                case 47:
                    e eVar4 = aVar.f37054e;
                    eVar4.f37137f = typedArrayObtainStyledAttributes.getFloat(index, eVar4.f37137f);
                    break;
                case 48:
                    e eVar5 = aVar.f37054e;
                    eVar5.f37138g = typedArrayObtainStyledAttributes.getFloat(index, eVar5.f37138g);
                    break;
                case 49:
                    e eVar6 = aVar.f37054e;
                    eVar6.f37139h = typedArrayObtainStyledAttributes.getDimension(index, eVar6.f37139h);
                    break;
                case 50:
                    e eVar7 = aVar.f37054e;
                    eVar7.f37140i = typedArrayObtainStyledAttributes.getDimension(index, eVar7.f37140i);
                    break;
                case 51:
                    e eVar8 = aVar.f37054e;
                    eVar8.f37141j = typedArrayObtainStyledAttributes.getDimension(index, eVar8.f37141j);
                    break;
                case 52:
                    e eVar9 = aVar.f37054e;
                    eVar9.f37142k = typedArrayObtainStyledAttributes.getDimension(index, eVar9.f37142k);
                    break;
                case 53:
                    e eVar10 = aVar.f37054e;
                    eVar10.f37143l = typedArrayObtainStyledAttributes.getDimension(index, eVar10.f37143l);
                    break;
                case 54:
                    b bVar40 = aVar.f37053d;
                    bVar40.f37077U = typedArrayObtainStyledAttributes.getInt(index, bVar40.f37077U);
                    break;
                case 55:
                    b bVar41 = aVar.f37053d;
                    bVar41.f37078V = typedArrayObtainStyledAttributes.getInt(index, bVar41.f37078V);
                    break;
                case 56:
                    b bVar42 = aVar.f37053d;
                    bVar42.f37079W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar42.f37079W);
                    break;
                case 57:
                    b bVar43 = aVar.f37053d;
                    bVar43.f37080X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar43.f37080X);
                    break;
                case 58:
                    b bVar44 = aVar.f37053d;
                    bVar44.f37081Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar44.f37081Y);
                    break;
                case 59:
                    b bVar45 = aVar.f37053d;
                    bVar45.f37082Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar45.f37082Z);
                    break;
                case 60:
                    e eVar11 = aVar.f37054e;
                    eVar11.f37134c = typedArrayObtainStyledAttributes.getFloat(index, eVar11.f37134c);
                    break;
                case 61:
                    b bVar46 = aVar.f37053d;
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, bVar46.f37117y);
                    if (resourceId14 == -1) {
                        resourceId14 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    bVar46.f37117y = resourceId14;
                    break;
                case 62:
                    b bVar47 = aVar.f37053d;
                    bVar47.f37118z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar47.f37118z);
                    break;
                case 63:
                    b bVar48 = aVar.f37053d;
                    bVar48.f37057A = typedArrayObtainStyledAttributes.getFloat(index, bVar48.f37057A);
                    break;
                case 64:
                    c cVar = aVar.f37052c;
                    int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, cVar.f37121c);
                    if (resourceId15 == -1) {
                        resourceId15 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    cVar.f37121c = resourceId15;
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        aVar.f37052c.f37122d = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        aVar.f37052c.f37122d = Easing.f36716a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f37052c.f37124f = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f37052c;
                    cVar2.f37126h = typedArrayObtainStyledAttributes.getFloat(index, cVar2.f37126h);
                    break;
                case 68:
                    d dVar4 = aVar.f37051b;
                    dVar4.f37131e = typedArrayObtainStyledAttributes.getFloat(index, dVar4.f37131e);
                    break;
                case 69:
                    aVar.f37053d.f37083a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f37053d.f37085b0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f37053d;
                    bVar49.f37087c0 = typedArrayObtainStyledAttributes.getInt(index, bVar49.f37087c0);
                    break;
                case 73:
                    b bVar50 = aVar.f37053d;
                    bVar50.f37089d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar50.f37089d0);
                    break;
                case 74:
                    aVar.f37053d.f37095g0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f37053d;
                    bVar51.f37103k0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar51.f37103k0);
                    break;
                case 76:
                    c cVar3 = aVar.f37052c;
                    cVar3.f37123e = typedArrayObtainStyledAttributes.getInt(index, cVar3.f37123e);
                    break;
                case 77:
                    aVar.f37053d.f37097h0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f37051b;
                    dVar5.f37129c = typedArrayObtainStyledAttributes.getInt(index, dVar5.f37129c);
                    break;
                case 79:
                    c cVar4 = aVar.f37052c;
                    cVar4.f37125g = typedArrayObtainStyledAttributes.getFloat(index, cVar4.f37125g);
                    break;
                case 80:
                    b bVar52 = aVar.f37053d;
                    bVar52.f37099i0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar52.f37099i0);
                    break;
                case 81:
                    b bVar53 = aVar.f37053d;
                    bVar53.f37101j0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar53.f37101j0);
                    break;
                case 82:
                    StringBuilder sbM1556G = outline.m1556G("unused attribute 0x");
                    sbM1556G.append(Integer.toHexString(index));
                    sbM1556G.append("   ");
                    sbM1556G.append(f37046b.get(index));
                    Log.w("ConstraintSet", sbM1556G.toString());
                    break;
                default:
                    StringBuilder sbM1556G2 = outline.m1556G("Unknown attribute 0x");
                    sbM1556G2.append(Integer.toHexString(index));
                    sbM1556G2.append("   ");
                    sbM1556G2.append(f37046b.get(index));
                    Log.w("ConstraintSet", sbM1556G2.toString());
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: renamed from: e */
    public void m15854e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarM15853d = m15853d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarM15853d.f37053d.f37084b = true;
                    }
                    this.f37049e.put(Integer.valueOf(aVarM15853d.f37050a), aVarM15853d);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}

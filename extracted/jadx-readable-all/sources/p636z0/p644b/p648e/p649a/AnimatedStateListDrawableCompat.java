package p636z0.p644b.p648e.p649a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.p650f.C7491a;
import p636z0.p644b.p653h.ResourceManagerInternal;
import p636z0.p688f0.p689a.p690a.AnimatedVectorDrawableCompat;
import p636z0.p688f0.p689a.p690a.VectorDrawableCompat;
import p636z0.p691g.LongSparseArray;
import p636z0.p691g.SparseArrayCompat;
import p636z0.p725k.C8162a;
import p636z0.p725k.p729e.p730l.TintAwareDrawable;

/* JADX INFO: renamed from: z0.b.e.a.a, reason: use source file name */
/* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class AnimatedStateListDrawableCompat extends StateListDrawable implements TintAwareDrawable {

    /* JADX INFO: renamed from: u */
    public c f34594u;

    /* JADX INFO: renamed from: v */
    public g f34595v;

    /* JADX INFO: renamed from: w */
    public int f34596w;

    /* JADX INFO: renamed from: x */
    public int f34597x;

    /* JADX INFO: renamed from: y */
    public boolean f34598y;

    /* JADX INFO: renamed from: z0.b.e.a.a$b */
    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    public static class b extends g {

        /* JADX INFO: renamed from: a */
        public final Animatable f34599a;

        public b(Animatable animatable) {
            super(null);
            this.f34599a = animatable;
        }

        @Override // p636z0.p644b.p648e.p649a.AnimatedStateListDrawableCompat.g
        /* JADX INFO: renamed from: c */
        public void mo14712c() {
            this.f34599a.start();
        }

        @Override // p636z0.p644b.p648e.p649a.AnimatedStateListDrawableCompat.g
        /* JADX INFO: renamed from: d */
        public void mo14713d() {
            this.f34599a.stop();
        }
    }

    /* JADX INFO: renamed from: z0.b.e.a.a$c */
    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    public static class c extends StateListDrawable.a {

        /* JADX INFO: renamed from: K */
        public LongSparseArray<Long> f34600K;

        /* JADX INFO: renamed from: L */
        public SparseArrayCompat<Integer> f34601L;

        public c(c cVar, AnimatedStateListDrawableCompat animatedStateListDrawableCompat, Resources resources) {
            super(cVar, animatedStateListDrawableCompat, resources);
            if (cVar != null) {
                this.f34600K = cVar.f34600K;
                this.f34601L = cVar.f34601L;
            } else {
                this.f34600K = new LongSparseArray<>();
                this.f34601L = new SparseArrayCompat<>();
            }
        }

        /* JADX INFO: renamed from: h */
        public static long m14714h(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        @Override // p636z0.p644b.p648e.p649a.StateListDrawable.a, p636z0.p644b.p648e.p649a.DrawableContainer.c
        /* JADX INFO: renamed from: e */
        public void mo14715e() {
            this.f34600K = this.f34600K.clone();
            this.f34601L = this.f34601L.clone();
        }

        /* JADX INFO: renamed from: i */
        public int m14716i(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f34601L.m15617g(i, 0).intValue();
        }

        @Override // p636z0.p644b.p648e.p649a.StateListDrawable.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        @Override // p636z0.p644b.p648e.p649a.StateListDrawable.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }
    }

    /* JADX INFO: renamed from: z0.b.e.a.a$d */
    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    public static class d extends g {

        /* JADX INFO: renamed from: a */
        public final AnimatedVectorDrawableCompat f34602a;

        public d(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            super(null);
            this.f34602a = animatedVectorDrawableCompat;
        }

        @Override // p636z0.p644b.p648e.p649a.AnimatedStateListDrawableCompat.g
        /* JADX INFO: renamed from: c */
        public void mo14712c() {
            this.f34602a.start();
        }

        @Override // p636z0.p644b.p648e.p649a.AnimatedStateListDrawableCompat.g
        /* JADX INFO: renamed from: d */
        public void mo14713d() {
            this.f34602a.stop();
        }
    }

    /* JADX INFO: renamed from: z0.b.e.a.a$e */
    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    public static class e extends g {

        /* JADX INFO: renamed from: a */
        public final ObjectAnimator f34603a;

        /* JADX INFO: renamed from: b */
        public final boolean f34604b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super(null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(fVar.f34607c);
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f34604b = z2;
            this.f34603a = objectAnimatorOfInt;
        }

        @Override // p636z0.p644b.p648e.p649a.AnimatedStateListDrawableCompat.g
        /* JADX INFO: renamed from: a */
        public boolean mo14717a() {
            return this.f34604b;
        }

        @Override // p636z0.p644b.p648e.p649a.AnimatedStateListDrawableCompat.g
        /* JADX INFO: renamed from: b */
        public void mo14718b() {
            this.f34603a.reverse();
        }

        @Override // p636z0.p644b.p648e.p649a.AnimatedStateListDrawableCompat.g
        /* JADX INFO: renamed from: c */
        public void mo14712c() {
            this.f34603a.start();
        }

        @Override // p636z0.p644b.p648e.p649a.AnimatedStateListDrawableCompat.g
        /* JADX INFO: renamed from: d */
        public void mo14713d() {
            this.f34603a.cancel();
        }
    }

    /* JADX INFO: renamed from: z0.b.e.a.a$f */
    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    public static class f implements TimeInterpolator {

        /* JADX INFO: renamed from: a */
        public int[] f34605a;

        /* JADX INFO: renamed from: b */
        public int f34606b;

        /* JADX INFO: renamed from: c */
        public int f34607c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f34606b = numberOfFrames;
            int[] iArr = this.f34605a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f34605a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f34605a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f34607c = i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f34607c) + 0.5f);
            int i2 = this.f34606b;
            int[] iArr = this.f34605a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f34607c : 0.0f);
        }
    }

    /* JADX INFO: renamed from: z0.b.e.a.a$g */
    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    public static abstract class g {
        public g(a aVar) {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo14717a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public void mo14718b() {
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo14712c();

        /* JADX INFO: renamed from: d */
        public abstract void mo14713d();
    }

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    /* JADX INFO: renamed from: g */
    public static AnimatedStateListDrawableCompat m14708g(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int i;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        String name = xmlPullParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        AnimatedStateListDrawableCompat animatedStateListDrawableCompat = new AnimatedStateListDrawableCompat();
        TypedArray typedArrayM16038I = C8162a.m16038I(resources2, theme, attributeSet, C7491a.f34662a);
        int i2 = 1;
        animatedStateListDrawableCompat.setVisible(typedArrayM16038I.getBoolean(1, true), true);
        c cVar = animatedStateListDrawableCompat.f34594u;
        cVar.f34635d |= typedArrayM16038I.getChangingConfigurations();
        int i3 = 2;
        cVar.f34640i = typedArrayM16038I.getBoolean(2, cVar.f34640i);
        int i4 = 3;
        cVar.f34643l = typedArrayM16038I.getBoolean(3, cVar.f34643l);
        int i5 = 4;
        cVar.f34623A = typedArrayM16038I.getInt(4, cVar.f34623A);
        cVar.f34624B = typedArrayM16038I.getInt(5, cVar.f34624B);
        boolean z = false;
        animatedStateListDrawableCompat.setDither(typedArrayM16038I.getBoolean(0, cVar.f34655x));
        animatedStateListDrawableCompat.f34609g.m14726f(resources2);
        typedArrayM16038I.recycle();
        int depth2 = xmlPullParser.getDepth() + 1;
        while (true) {
            int next3 = xmlPullParser.next();
            if (next3 == i2 || ((depth = xmlPullParser.getDepth()) < depth2 && next3 == i4)) {
                break;
            }
            if (next3 == i3 && depth <= depth2) {
                if (xmlPullParser.getName().equals("item")) {
                    TypedArray typedArrayM16038I2 = C8162a.m16038I(resources2, theme, attributeSet, C7491a.f34663b);
                    int resourceId = typedArrayM16038I2.getResourceId(z ? 1 : 0, z ? 1 : 0);
                    int resourceId2 = typedArrayM16038I2.getResourceId(i2, -1);
                    Drawable drawableM14938f = resourceId2 > 0 ? ResourceManagerInternal.m14931d().m14938f(context2, resourceId2) : null;
                    typedArrayM16038I2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i6 = 0;
                    int i7 = 0;
                    while (i7 < attributeCount) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                        int i8 = depth2;
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i9 = i6 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i7, z)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i6] = attributeNameResource;
                            i6 = i9;
                        }
                        i7++;
                        depth2 = i8;
                    }
                    i = depth2;
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i6);
                    if (drawableM14938f == null) {
                        do {
                            next2 = xmlPullParser.next();
                        } while (next2 == i5);
                        if (next2 != 2) {
                            throw new XmlPullParserException(outline.m1554E(xmlPullParser, new StringBuilder(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"));
                        }
                        drawableM14938f = xmlPullParser.getName().equals("vector") ? VectorDrawableCompat.m15554a(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                    }
                    if (drawableM14938f == null) {
                        throw new XmlPullParserException(outline.m1554E(xmlPullParser, new StringBuilder(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"));
                    }
                    c cVar2 = animatedStateListDrawableCompat.f34594u;
                    int iM14722a = cVar2.m14722a(drawableM14938f);
                    cVar2.f34661J[iM14722a] = iArrTrimStateSet;
                    cVar2.f34601L.m15619j(iM14722a, Integer.valueOf(resourceId));
                    i2 = 1;
                    i3 = 2;
                    i4 = 3;
                } else {
                    i = depth2;
                    if (xmlPullParser.getName().equals("transition")) {
                        TypedArray typedArrayM16038I3 = C8162a.m16038I(resources2, theme, attributeSet, C7491a.f34664c);
                        int resourceId3 = typedArrayM16038I3.getResourceId(2, -1);
                        int resourceId4 = typedArrayM16038I3.getResourceId(1, -1);
                        int resourceId5 = typedArrayM16038I3.getResourceId(z ? 1 : 0, -1);
                        Drawable drawableM14938f2 = resourceId5 > 0 ? ResourceManagerInternal.m14931d().m14938f(context2, resourceId5) : null;
                        boolean z2 = typedArrayM16038I3.getBoolean(3, z);
                        typedArrayM16038I3.recycle();
                        if (drawableM14938f2 == null) {
                            do {
                                next = xmlPullParser.next();
                            } while (next == i5);
                            if (next != 2) {
                                throw new XmlPullParserException(outline.m1554E(xmlPullParser, new StringBuilder(), ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"));
                            }
                            if (xmlPullParser.getName().equals("animated-vector")) {
                                drawableM14938f2 = new AnimatedVectorDrawableCompat(context2, null, null);
                                drawableM14938f2.inflate(resources2, xmlPullParser, attributeSet, theme);
                            } else {
                                drawableM14938f2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                            }
                        }
                        if (drawableM14938f2 == null) {
                            throw new XmlPullParserException(outline.m1554E(xmlPullParser, new StringBuilder(), ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"));
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(outline.m1554E(xmlPullParser, new StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
                        }
                        c cVar3 = animatedStateListDrawableCompat.f34594u;
                        int iM14722a2 = cVar3.m14722a(drawableM14938f2);
                        long jM14714h = c.m14714h(resourceId3, resourceId4);
                        long j2 = z2 ? 8589934592L : 0L;
                        long j3 = iM14722a2;
                        cVar3.f34600K.m15584a(jM14714h, Long.valueOf(j3 | j2));
                        if (z2) {
                            cVar3.f34600K.m15584a(c.m14714h(resourceId4, resourceId3), Long.valueOf(j3 | 4294967296L | j2));
                        }
                    }
                    i2 = 1;
                    z = false;
                    i3 = 2;
                    i4 = 3;
                    i5 = 4;
                    context2 = context;
                    resources2 = resources;
                }
                depth2 = i;
            }
        }
        animatedStateListDrawableCompat.onStateChange(animatedStateListDrawableCompat.getState());
        return animatedStateListDrawableCompat;
    }

    @Override // p636z0.p644b.p648e.p649a.StateListDrawable, p636z0.p644b.p648e.p649a.DrawableContainer
    /* JADX INFO: renamed from: b */
    public DrawableContainer.c mo14709b() {
        return new c(this.f34594u, this, null);
    }

    @Override // p636z0.p644b.p648e.p649a.StateListDrawable, p636z0.p644b.p648e.p649a.DrawableContainer
    /* JADX INFO: renamed from: e */
    public void mo14710e(DrawableContainer.c cVar) {
        super.mo14710e(cVar);
        if (cVar instanceof c) {
            this.f34594u = (c) cVar;
        }
    }

    @Override // p636z0.p644b.p648e.p649a.StateListDrawable
    /* JADX INFO: renamed from: f */
    public StateListDrawable.a mo14709b() {
        return new c(this.f34594u, this, null);
    }

    @Override // p636z0.p644b.p648e.p649a.DrawableContainer, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f34595v;
        if (gVar != null) {
            gVar.mo14713d();
            this.f34595v = null;
            m14721d(this.f34596w);
            this.f34596w = -1;
            this.f34597x = -1;
        }
    }

    @Override // p636z0.p644b.p648e.p649a.StateListDrawable, p636z0.p644b.p648e.p649a.DrawableContainer, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f34598y) {
            super.mutate();
            if (this == this) {
                this.f34594u.mo14715e();
                this.f34598y = true;
            }
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    @Override // p636z0.p644b.p648e.p649a.StateListDrawable, p636z0.p644b.p648e.p649a.DrawableContainer, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        c cVar;
        int iM14716i;
        int iM14716i2;
        boolean z;
        int iLongValue;
        boolean z2;
        Object obj;
        g bVar;
        boolean z3;
        c cVar2 = this.f34594u;
        int iM14727g = cVar2.m14727g(iArr);
        if (iM14727g < 0) {
            iM14727g = cVar2.m14727g(StateSet.WILD_CARD);
        }
        int i = this.f34615m;
        boolean z4 = false;
        if (iM14727g != i) {
            g gVar = this.f34595v;
            if (gVar == null) {
                this.f34595v = null;
                this.f34597x = -1;
                this.f34596w = -1;
                cVar = this.f34594u;
                iM14716i = cVar.m14716i(i);
                iM14716i2 = cVar.m14716i(iM14727g);
                if (iM14716i2 != 0 && iM14716i != 0) {
                    iLongValue = (int) cVar.f34600K.m15590j(c.m14714h(iM14716i, iM14716i2), -1L).longValue();
                    if (iLongValue >= 0) {
                        if ((cVar.f34600K.m15590j(c.m14714h(iM14716i, iM14716i2), -1L).longValue() & 8589934592L) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        m14721d(iLongValue);
                        obj = this.f34611i;
                        if (obj instanceof AnimationDrawable) {
                            if ((cVar.f34600K.m15590j(c.m14714h(iM14716i, iM14716i2), -1L).longValue() & 4294967296L) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            bVar = new e((AnimationDrawable) obj, z3, z2);
                        } else if (obj instanceof AnimatedVectorDrawableCompat) {
                            bVar = new d((AnimatedVectorDrawableCompat) obj);
                        } else if (obj instanceof Animatable) {
                            bVar = new b((Animatable) obj);
                        }
                        bVar.mo14712c();
                        this.f34595v = bVar;
                        this.f34597x = i;
                        this.f34596w = iM14727g;
                        z = true;
                    }
                }
                z = false;
            } else {
                if (iM14727g != this.f34596w) {
                    if (iM14727g == this.f34597x && gVar.mo14717a()) {
                        gVar.mo14718b();
                        this.f34596w = this.f34597x;
                        this.f34597x = iM14727g;
                    } else {
                        i = this.f34596w;
                        gVar.mo14713d();
                        this.f34595v = null;
                        this.f34597x = -1;
                        this.f34596w = -1;
                        cVar = this.f34594u;
                        iM14716i = cVar.m14716i(i);
                        iM14716i2 = cVar.m14716i(iM14727g);
                        if (iM14716i2 != 0) {
                            iLongValue = (int) cVar.f34600K.m15590j(c.m14714h(iM14716i, iM14716i2), -1L).longValue();
                            if (iLongValue >= 0) {
                                if ((cVar.f34600K.m15590j(c.m14714h(iM14716i, iM14716i2), -1L).longValue() & 8589934592L) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                m14721d(iLongValue);
                                obj = this.f34611i;
                                if (obj instanceof AnimationDrawable) {
                                    if ((cVar.f34600K.m15590j(c.m14714h(iM14716i, iM14716i2), -1L).longValue() & 4294967296L) != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    bVar = new e((AnimationDrawable) obj, z3, z2);
                                } else if (obj instanceof AnimatedVectorDrawableCompat) {
                                    bVar = new d((AnimatedVectorDrawableCompat) obj);
                                } else if (obj instanceof Animatable) {
                                    bVar = new b((Animatable) obj);
                                }
                                bVar.mo14712c();
                                this.f34595v = bVar;
                                this.f34597x = i;
                                this.f34596w = iM14727g;
                            }
                        }
                        z = false;
                    }
                }
                z = true;
            }
            if (z || m14721d(iM14727g)) {
                z4 = true;
            }
        }
        Drawable drawable = this.f34611i;
        return drawable != null ? z4 | drawable.setState(iArr) : z4;
    }

    @Override // p636z0.p644b.p648e.p649a.DrawableContainer, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.f34595v;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo14712c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public AnimatedStateListDrawableCompat(c cVar, Resources resources) {
        super(null);
        this.f34596w = -1;
        this.f34597x = -1;
        c cVar2 = new c(cVar, this, resources);
        super.mo14710e(cVar2);
        this.f34594u = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }
}

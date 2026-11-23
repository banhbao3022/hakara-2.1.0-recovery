package p007c.p190n.p194b.p334e.p365y;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;

/* JADX INFO: renamed from: c.n.b.e.y.j, reason: use source file name */
/* JADX INFO: compiled from: ShapeAppearanceModel.java */
/* JADX INFO: loaded from: classes.dex */
public class ShapeAppearanceModel {

    /* JADX INFO: renamed from: a */
    public static final CornerSize f25618a = new RelativeCornerSize(0.5f);

    /* JADX INFO: renamed from: b */
    public CornerTreatment f25619b;

    /* JADX INFO: renamed from: c */
    public CornerTreatment f25620c;

    /* JADX INFO: renamed from: d */
    public CornerTreatment f25621d;

    /* JADX INFO: renamed from: e */
    public CornerTreatment f25622e;

    /* JADX INFO: renamed from: f */
    public CornerSize f25623f;

    /* JADX INFO: renamed from: g */
    public CornerSize f25624g;

    /* JADX INFO: renamed from: h */
    public CornerSize f25625h;

    /* JADX INFO: renamed from: i */
    public CornerSize f25626i;

    /* JADX INFO: renamed from: j */
    public EdgeTreatment f25627j;

    /* JADX INFO: renamed from: k */
    public EdgeTreatment f25628k;

    /* JADX INFO: renamed from: l */
    public EdgeTreatment f25629l;

    /* JADX INFO: renamed from: m */
    public EdgeTreatment f25630m;

    public ShapeAppearanceModel(b bVar, a aVar) {
        this.f25619b = bVar.f25631a;
        this.f25620c = bVar.f25632b;
        this.f25621d = bVar.f25633c;
        this.f25622e = bVar.f25634d;
        this.f25623f = bVar.f25635e;
        this.f25624g = bVar.f25636f;
        this.f25625h = bVar.f25637g;
        this.f25626i = bVar.f25638h;
        this.f25627j = bVar.f25639i;
        this.f25628k = bVar.f25640j;
        this.f25629l = bVar.f25641k;
        this.f25630m = bVar.f25642l;
    }

    /* JADX INFO: renamed from: a */
    public static b m11391a(Context context, int i, int i2, CornerSize cornerSize) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C4801b.f24738J);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            CornerSize cornerSizeM11394d = m11394d(typedArrayObtainStyledAttributes, 5, cornerSize);
            CornerSize cornerSizeM11394d2 = m11394d(typedArrayObtainStyledAttributes, 8, cornerSizeM11394d);
            CornerSize cornerSizeM11394d3 = m11394d(typedArrayObtainStyledAttributes, 9, cornerSizeM11394d);
            CornerSize cornerSizeM11394d4 = m11394d(typedArrayObtainStyledAttributes, 7, cornerSizeM11394d);
            CornerSize cornerSizeM11394d5 = m11394d(typedArrayObtainStyledAttributes, 6, cornerSizeM11394d);
            b bVar = new b();
            CornerTreatment cornerTreatmentM11014t = C4799a.m11014t(i4);
            bVar.f25631a = cornerTreatmentM11014t;
            float fM11397b = b.m11397b(cornerTreatmentM11014t);
            if (fM11397b != -1.0f) {
                bVar.m11402f(fM11397b);
            }
            bVar.f25635e = cornerSizeM11394d2;
            CornerTreatment cornerTreatmentM11014t2 = C4799a.m11014t(i5);
            bVar.f25632b = cornerTreatmentM11014t2;
            float fM11397b2 = b.m11397b(cornerTreatmentM11014t2);
            if (fM11397b2 != -1.0f) {
                bVar.m11403g(fM11397b2);
            }
            bVar.f25636f = cornerSizeM11394d3;
            CornerTreatment cornerTreatmentM11014t3 = C4799a.m11014t(i6);
            bVar.f25633c = cornerTreatmentM11014t3;
            float fM11397b3 = b.m11397b(cornerTreatmentM11014t3);
            if (fM11397b3 != -1.0f) {
                bVar.m11401e(fM11397b3);
            }
            bVar.f25637g = cornerSizeM11394d4;
            CornerTreatment cornerTreatmentM11014t4 = C4799a.m11014t(i7);
            bVar.f25634d = cornerTreatmentM11014t4;
            float fM11397b4 = b.m11397b(cornerTreatmentM11014t4);
            if (fM11397b4 != -1.0f) {
                bVar.m11400d(fM11397b4);
            }
            bVar.f25638h = cornerSizeM11394d5;
            return bVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static b m11392b(Context context, AttributeSet attributeSet, int i, int i2) {
        return m11393c(context, attributeSet, i, i2, new AbsoluteCornerSize(0));
    }

    /* JADX INFO: renamed from: c */
    public static b m11393c(Context context, AttributeSet attributeSet, int i, int i2, CornerSize cornerSize) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4801b.f24732D, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m11391a(context, resourceId, resourceId2, cornerSize);
    }

    /* JADX INFO: renamed from: d */
    public static CornerSize m11394d(TypedArray typedArray, int i, CornerSize cornerSize) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return cornerSize;
        }
        int i2 = typedValuePeekValue.type;
        if (i2 == 5) {
            return new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new RelativeCornerSize(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cornerSize;
    }

    /* JADX INFO: renamed from: e */
    public boolean m11395e(RectF rectF) {
        boolean z = this.f25630m.getClass().equals(EdgeTreatment.class) && this.f25628k.getClass().equals(EdgeTreatment.class) && this.f25627j.getClass().equals(EdgeTreatment.class) && this.f25629l.getClass().equals(EdgeTreatment.class);
        float fMo11363a = this.f25623f.mo11363a(rectF);
        return z && ((this.f25624g.mo11363a(rectF) > fMo11363a ? 1 : (this.f25624g.mo11363a(rectF) == fMo11363a ? 0 : -1)) == 0 && (this.f25626i.mo11363a(rectF) > fMo11363a ? 1 : (this.f25626i.mo11363a(rectF) == fMo11363a ? 0 : -1)) == 0 && (this.f25625h.mo11363a(rectF) > fMo11363a ? 1 : (this.f25625h.mo11363a(rectF) == fMo11363a ? 0 : -1)) == 0) && ((this.f25620c instanceof RoundedCornerTreatment) && (this.f25619b instanceof RoundedCornerTreatment) && (this.f25621d instanceof RoundedCornerTreatment) && (this.f25622e instanceof RoundedCornerTreatment));
    }

    /* JADX INFO: renamed from: f */
    public ShapeAppearanceModel m11396f(float f) {
        b bVar = new b(this);
        bVar.m11402f(f);
        bVar.m11403g(f);
        bVar.m11401e(f);
        bVar.m11400d(f);
        return bVar.m11398a();
    }

    /* JADX INFO: renamed from: c.n.b.e.y.j$b */
    /* JADX INFO: compiled from: ShapeAppearanceModel.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public CornerTreatment f25631a;

        /* JADX INFO: renamed from: b */
        public CornerTreatment f25632b;

        /* JADX INFO: renamed from: c */
        public CornerTreatment f25633c;

        /* JADX INFO: renamed from: d */
        public CornerTreatment f25634d;

        /* JADX INFO: renamed from: e */
        public CornerSize f25635e;

        /* JADX INFO: renamed from: f */
        public CornerSize f25636f;

        /* JADX INFO: renamed from: g */
        public CornerSize f25637g;

        /* JADX INFO: renamed from: h */
        public CornerSize f25638h;

        /* JADX INFO: renamed from: i */
        public EdgeTreatment f25639i;

        /* JADX INFO: renamed from: j */
        public EdgeTreatment f25640j;

        /* JADX INFO: renamed from: k */
        public EdgeTreatment f25641k;

        /* JADX INFO: renamed from: l */
        public EdgeTreatment f25642l;

        public b() {
            this.f25631a = new RoundedCornerTreatment();
            this.f25632b = new RoundedCornerTreatment();
            this.f25633c = new RoundedCornerTreatment();
            this.f25634d = new RoundedCornerTreatment();
            this.f25635e = new AbsoluteCornerSize(0.0f);
            this.f25636f = new AbsoluteCornerSize(0.0f);
            this.f25637g = new AbsoluteCornerSize(0.0f);
            this.f25638h = new AbsoluteCornerSize(0.0f);
            this.f25639i = new EdgeTreatment();
            this.f25640j = new EdgeTreatment();
            this.f25641k = new EdgeTreatment();
            this.f25642l = new EdgeTreatment();
        }

        /* JADX INFO: renamed from: b */
        public static float m11397b(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) cornerTreatment).f25617a;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) cornerTreatment).f25568a;
            }
            return -1.0f;
        }

        /* JADX INFO: renamed from: a */
        public ShapeAppearanceModel m11398a() {
            return new ShapeAppearanceModel(this, null);
        }

        /* JADX INFO: renamed from: c */
        public b m11399c(float f) {
            m11402f(f);
            m11403g(f);
            m11401e(f);
            m11400d(f);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m11400d(float f) {
            this.f25638h = new AbsoluteCornerSize(f);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m11401e(float f) {
            this.f25637g = new AbsoluteCornerSize(f);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m11402f(float f) {
            this.f25635e = new AbsoluteCornerSize(f);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m11403g(float f) {
            this.f25636f = new AbsoluteCornerSize(f);
            return this;
        }

        public b(ShapeAppearanceModel shapeAppearanceModel) {
            this.f25631a = new RoundedCornerTreatment();
            this.f25632b = new RoundedCornerTreatment();
            this.f25633c = new RoundedCornerTreatment();
            this.f25634d = new RoundedCornerTreatment();
            this.f25635e = new AbsoluteCornerSize(0.0f);
            this.f25636f = new AbsoluteCornerSize(0.0f);
            this.f25637g = new AbsoluteCornerSize(0.0f);
            this.f25638h = new AbsoluteCornerSize(0.0f);
            this.f25639i = new EdgeTreatment();
            this.f25640j = new EdgeTreatment();
            this.f25641k = new EdgeTreatment();
            this.f25642l = new EdgeTreatment();
            this.f25631a = shapeAppearanceModel.f25619b;
            this.f25632b = shapeAppearanceModel.f25620c;
            this.f25633c = shapeAppearanceModel.f25621d;
            this.f25634d = shapeAppearanceModel.f25622e;
            this.f25635e = shapeAppearanceModel.f25623f;
            this.f25636f = shapeAppearanceModel.f25624g;
            this.f25637g = shapeAppearanceModel.f25625h;
            this.f25638h = shapeAppearanceModel.f25626i;
            this.f25639i = shapeAppearanceModel.f25627j;
            this.f25640j = shapeAppearanceModel.f25628k;
            this.f25641k = shapeAppearanceModel.f25629l;
            this.f25642l = shapeAppearanceModel.f25630m;
        }
    }

    public ShapeAppearanceModel() {
        this.f25619b = new RoundedCornerTreatment();
        this.f25620c = new RoundedCornerTreatment();
        this.f25621d = new RoundedCornerTreatment();
        this.f25622e = new RoundedCornerTreatment();
        this.f25623f = new AbsoluteCornerSize(0.0f);
        this.f25624g = new AbsoluteCornerSize(0.0f);
        this.f25625h = new AbsoluteCornerSize(0.0f);
        this.f25626i = new AbsoluteCornerSize(0.0f);
        this.f25627j = new EdgeTreatment();
        this.f25628k = new EdgeTreatment();
        this.f25629l = new EdgeTreatment();
        this.f25630m = new EdgeTreatment();
    }
}

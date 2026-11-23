package p007c.p190n.p194b.p334e.p337c;

import android.util.Property;
import android.view.ViewGroup;
import mtp.media.karaoke.R;

/* JADX INFO: renamed from: c.n.b.e.c.d, reason: use source file name */
/* JADX INFO: compiled from: ChildrenAlphaProperty.java */
/* JADX INFO: loaded from: classes.dex */
public class ChildrenAlphaProperty extends Property<ViewGroup, Float> {

    /* JADX INFO: renamed from: a */
    public static final Property<ViewGroup, Float> f24799a = new ChildrenAlphaProperty("childrenAlpha");

    public ChildrenAlphaProperty(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(ViewGroup viewGroup, Float f) {
        ViewGroup viewGroup2 = viewGroup;
        float fFloatValue = f.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(fFloatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}

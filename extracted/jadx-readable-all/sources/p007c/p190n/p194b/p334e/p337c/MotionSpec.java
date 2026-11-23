package p007c.p190n.p194b.p334e.p337c;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.SimpleArrayMap;

/* JADX INFO: renamed from: c.n.b.e.c.h, reason: use source file name */
/* JADX INFO: compiled from: MotionSpec.java */
/* JADX INFO: loaded from: classes.dex */
public class MotionSpec {

    /* JADX INFO: renamed from: a */
    public final SimpleArrayMap<String, MotionTiming> f24806a = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: b */
    public final SimpleArrayMap<String, PropertyValuesHolder[]> f24807b = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: a */
    public static MotionSpec m11034a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m11035b(context, resourceId);
    }

    /* JADX INFO: renamed from: b */
    public static MotionSpec m11035b(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m11036c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m11036c(arrayList);
        } catch (Exception e) {
            StringBuilder sbM1556G = outline.m1556G("Can't load animation resource ID #0x");
            sbM1556G.append(Integer.toHexString(i));
            Log.w("MotionSpec", sbM1556G.toString(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static MotionSpec m11036c(List<Animator> list) {
        MotionSpec motionSpec = new MotionSpec();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            motionSpec.f24807b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AnimationUtils.f24794b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AnimationUtils.f24795c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AnimationUtils.f24796d;
            }
            MotionTiming motionTiming = new MotionTiming(startDelay, duration, interpolator);
            motionTiming.f24811d = objectAnimator.getRepeatCount();
            motionTiming.f24812e = objectAnimator.getRepeatMode();
            motionSpec.f24806a.put(propertyName, motionTiming);
        }
        return motionSpec;
    }

    /* JADX INFO: renamed from: d */
    public <T> ObjectAnimator m11037d(String str, T t, Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, m11038e(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        m11039f(str).m11041a(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: e */
    public PropertyValuesHolder[] m11038e(String str) {
        if (!m11040g(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] orDefault = this.f24807b.getOrDefault(str, null);
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[orDefault.length];
        for (int i = 0; i < orDefault.length; i++) {
            propertyValuesHolderArr[i] = orDefault[i].clone();
        }
        return propertyValuesHolderArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MotionSpec) {
            return this.f24806a.equals(((MotionSpec) obj).f24806a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public MotionTiming m11039f(String str) {
        if (this.f24806a.getOrDefault(str, null) != null) {
            return this.f24806a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: g */
    public boolean m11040g(String str) {
        return this.f24807b.getOrDefault(str, null) != null;
    }

    public int hashCode() {
        return this.f24806a.hashCode();
    }

    public String toString() {
        StringBuilder sbM1555F = outline.m1555F('\n');
        sbM1555F.append(MotionSpec.class.getName());
        sbM1555F.append('{');
        sbM1555F.append(Integer.toHexString(System.identityHashCode(this)));
        sbM1555F.append(" timings: ");
        sbM1555F.append(this.f24806a);
        sbM1555F.append("}\n");
        return sbM1555F.toString();
    }
}

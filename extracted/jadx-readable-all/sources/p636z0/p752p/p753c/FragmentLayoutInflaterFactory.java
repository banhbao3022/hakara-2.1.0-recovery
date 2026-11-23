package p636z0.p752p.p753c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p752p.C8311b;

/* JADX INFO: renamed from: z0.p.c.x, reason: use source file name */
/* JADX INFO: compiled from: FragmentLayoutInflaterFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentLayoutInflaterFactory implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: f */
    public final FragmentManager f38570f;

    /* JADX INFO: renamed from: z0.p.c.x$a */
    /* JADX INFO: compiled from: FragmentLayoutInflaterFactory.java */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ FragmentStateManager f38571f;

        public a(FragmentStateManager fragmentStateManager) {
            this.f38571f = fragmentStateManager;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            FragmentStateManager fragmentStateManager = this.f38571f;
            Fragment fragment = fragmentStateManager.f38341c;
            fragmentStateManager.m16485k();
            SpecialEffectsController.m16618f((ViewGroup) fragment.f38416M.getParent(), FragmentLayoutInflaterFactory.this.f38570f).m16623e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public FragmentLayoutInflaterFactory(FragmentManager fragmentManager) {
        this.f38570f = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        FragmentStateManager fragmentStateManagerM16687h;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f38570f);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8311b.f38259a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            SimpleArrayMap<ClassLoader, SimpleArrayMap<String, Class<?>>> simpleArrayMap = FragmentFactory.f38558a;
            try {
                zIsAssignableFrom = Fragment.class.isAssignableFrom(FragmentFactory.m16612b(classLoader, attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment fragmentM16655H = resourceId != -1 ? this.f38570f.m16655H(resourceId) : null;
                if (fragmentM16655H == null && string != null) {
                    fragmentM16655H = this.f38570f.m16656I(string);
                }
                if (fragmentM16655H == null && id != -1) {
                    fragmentM16655H = this.f38570f.m16655H(id);
                }
                if (fragmentM16655H == null) {
                    fragmentM16655H = this.f38570f.m16658K().mo16614a(context.getClassLoader(), attributeValue);
                    fragmentM16655H.f38445t = true;
                    fragmentM16655H.f38406C = resourceId != 0 ? resourceId : id;
                    fragmentM16655H.f38407D = id;
                    fragmentM16655H.f38408E = string;
                    fragmentM16655H.f38446u = true;
                    FragmentManager fragmentManager = this.f38570f;
                    fragmentM16655H.f38450y = fragmentManager;
                    FragmentHostCallback<?> fragmentHostCallback = fragmentManager.f38631q;
                    fragmentM16655H.f38451z = fragmentHostCallback;
                    fragmentM16655H.mo468m0(fragmentHostCallback.f38565g, attributeSet, fragmentM16655H.f38433h);
                    fragmentStateManagerM16687h = this.f38570f.m16673a(fragmentM16655H);
                    if (FragmentManager.m16647O(2)) {
                        Log.v("FragmentManager", "Fragment " + fragmentM16655H + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (fragmentM16655H.f38446u) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    fragmentM16655H.f38446u = true;
                    FragmentManager fragmentManager2 = this.f38570f;
                    fragmentM16655H.f38450y = fragmentManager2;
                    FragmentHostCallback<?> fragmentHostCallback2 = fragmentManager2.f38631q;
                    fragmentM16655H.f38451z = fragmentHostCallback2;
                    fragmentM16655H.mo468m0(fragmentHostCallback2.f38565g, attributeSet, fragmentM16655H.f38433h);
                    fragmentStateManagerM16687h = this.f38570f.m16687h(fragmentM16655H);
                    if (FragmentManager.m16647O(2)) {
                        Log.v("FragmentManager", "Retained Fragment " + fragmentM16655H + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                fragmentM16655H.f38415L = (ViewGroup) view;
                fragmentStateManagerM16687h.m16485k();
                fragmentStateManagerM16687h.m16484j();
                View view2 = fragmentM16655H.f38416M;
                if (view2 == null) {
                    throw new IllegalStateException(outline.m1600v("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (fragmentM16655H.f38416M.getTag() == null) {
                    fragmentM16655H.f38416M.setTag(string);
                }
                fragmentM16655H.f38416M.addOnAttachStateChangeListener(new a(fragmentStateManagerM16687h));
                return fragmentM16655H.f38416M;
            }
        }
        return null;
    }
}

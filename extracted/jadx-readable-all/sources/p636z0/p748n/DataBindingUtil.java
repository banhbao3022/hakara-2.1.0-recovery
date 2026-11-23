package p636z0.p748n;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: z0.n.e, reason: use source file name */
/* JADX INFO: compiled from: DataBindingUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class DataBindingUtil {

    /* JADX INFO: renamed from: a */
    public static DataBinderMapper f38199a = new DataBinderMapperImpl();

    /* JADX INFO: renamed from: a */
    public static <T extends ViewDataBinding> T m16402a(DataBindingComponent dataBindingComponent, View view, int i) {
        return (T) f38199a.mo384b(dataBindingComponent, view, i);
    }

    /* JADX INFO: renamed from: b */
    public static <T extends ViewDataBinding> T m16403b(DataBindingComponent dataBindingComponent, ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return (T) m16402a(dataBindingComponent, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return (T) f38199a.mo385c(dataBindingComponent, viewArr, i2);
    }

    /* JADX INFO: renamed from: c */
    public static <T extends ViewDataBinding> T m16404c(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        boolean z2 = viewGroup != null && z;
        return z2 ? (T) m16403b(null, viewGroup, z2 ? viewGroup.getChildCount() : 0, i) : (T) m16402a(null, layoutInflater.inflate(i, viewGroup, z), i);
    }
}

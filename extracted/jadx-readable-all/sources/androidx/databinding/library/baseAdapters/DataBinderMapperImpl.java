package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;
import p636z0.p748n.DataBinderMapper;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a */
    public static final SparseIntArray f745a = new SparseIntArray(0);

    @Override // p636z0.p748n.DataBinderMapper
    /* JADX INFO: renamed from: a */
    public List<DataBinderMapper> mo412a() {
        return new ArrayList(0);
    }

    @Override // p636z0.p748n.DataBinderMapper
    /* JADX INFO: renamed from: b */
    public ViewDataBinding mo384b(DataBindingComponent dataBindingComponent, View view, int i) {
        if (f745a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // p636z0.p748n.DataBinderMapper
    /* JADX INFO: renamed from: c */
    public ViewDataBinding mo385c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f745a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}

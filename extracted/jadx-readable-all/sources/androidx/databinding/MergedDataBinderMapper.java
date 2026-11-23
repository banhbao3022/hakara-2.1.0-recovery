package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p636z0.p748n.DataBinderMapper;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends DataBinderMapper {

    /* JADX INFO: renamed from: a */
    public Set<Class<? extends DataBinderMapper>> f714a = new HashSet();

    /* JADX INFO: renamed from: b */
    public List<DataBinderMapper> f715b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public List<String> f716c = new CopyOnWriteArrayList();

    @Override // p636z0.p748n.DataBinderMapper
    /* JADX INFO: renamed from: b */
    public ViewDataBinding mo384b(DataBindingComponent dataBindingComponent, View view, int i) {
        Iterator<DataBinderMapper> it = this.f715b.iterator();
        while (it.hasNext()) {
            ViewDataBinding viewDataBindingMo384b = it.next().mo384b(dataBindingComponent, view, i);
            if (viewDataBindingMo384b != null) {
                return viewDataBindingMo384b;
            }
        }
        if (m387e()) {
            return mo384b(dataBindingComponent, view, i);
        }
        return null;
    }

    @Override // p636z0.p748n.DataBinderMapper
    /* JADX INFO: renamed from: c */
    public ViewDataBinding mo385c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        Iterator<DataBinderMapper> it = this.f715b.iterator();
        while (it.hasNext()) {
            ViewDataBinding viewDataBindingMo385c = it.next().mo385c(dataBindingComponent, viewArr, i);
            if (viewDataBindingMo385c != null) {
                return viewDataBindingMo385c;
            }
        }
        if (m387e()) {
            return mo385c(dataBindingComponent, viewArr, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m386d(DataBinderMapper dataBinderMapper) {
        if (this.f714a.add((Class<? extends DataBinderMapper>) dataBinderMapper.getClass())) {
            this.f715b.add(dataBinderMapper);
            Iterator<DataBinderMapper> it = dataBinderMapper.mo412a().iterator();
            while (it.hasNext()) {
                m386d(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m387e() {
        boolean z = false;
        for (String str : this.f716c) {
            try {
                Class<?> cls = Class.forName(str);
                if (DataBinderMapper.class.isAssignableFrom(cls)) {
                    m386d((DataBinderMapper) cls.newInstance());
                    this.f716c.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e);
            } catch (InstantiationException e2) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e2);
            }
        }
        return z;
    }
}

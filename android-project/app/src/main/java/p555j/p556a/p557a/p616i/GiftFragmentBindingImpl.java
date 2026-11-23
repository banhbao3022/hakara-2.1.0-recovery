package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.snaprecycleview.view.indicator.CircleRecyclerPageIndicator;
import mtp.media.karaoke.data.model.User;
import p555j.p556a.p557a.p558a.p559a.p578j.GiftViewModel3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.i.f0, reason: use source file name */
/* JADX INFO: compiled from: GiftFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class GiftFragmentBindingImpl extends GiftFragmentBinding {

    /* JADX INFO: renamed from: w */
    public static final SparseIntArray f32519w;

    /* JADX INFO: renamed from: A */
    public long f32520A;

    /* JADX INFO: renamed from: x */
    public final LinearLayout f32521x;

    /* JADX INFO: renamed from: y */
    public final TextView f32522y;

    /* JADX INFO: renamed from: z */
    public final TextView f32523z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32519w = sparseIntArray;
        sparseIntArray.put(R.id.toLevelScreen, 5);
        sparseIntArray.put(R.id.lblExpSendGift, 6);
        sparseIntArray.put(R.id.seeAllLevel, 7);
        sparseIntArray.put(R.id.recycler_view, 8);
        sparseIntArray.put(R.id.pagingCenter, 9);
        sparseIntArray.put(R.id.linearLayout3, 10);
        sparseIntArray.put(R.id.btnRecharge, 11);
        sparseIntArray.put(R.id.linearLayout4, 12);
        sparseIntArray.put(R.id.spinner, 13);
        sparseIntArray.put(R.id.btnActionSendGift, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GiftFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 15, null, f32519w);
        super(dataBindingComponent, view, 1, (TextView) objArrM391i[14], (TextView) objArrM391i[11], (TextView) objArrM391i[6], (TextView) objArrM391i[1], (LinearLayout) objArrM391i[10], (LinearLayout) objArrM391i[12], (CircleRecyclerPageIndicator) objArrM391i[9], (ProgressBar) objArrM391i[2], (RecyclerView) objArrM391i[8], (ImageView) objArrM391i[7], (Spinner) objArrM391i[13], (RelativeLayout) objArrM391i[5]);
        this.f32520A = -1L;
        this.f32502t.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32521x = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArrM391i[3];
        this.f32522y = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArrM391i[4];
        this.f32523z = textView2;
        textView2.setTag(null);
        this.f32503u.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String str;
        String str2;
        String string;
        int nextLevelExps;
        int level;
        boolean z;
        int i;
        int currentLevelExps;
        int exps;
        int diamonds;
        int coins;
        synchronized (this) {
            j2 = this.f32520A;
            this.f32520A = 0L;
        }
        GiftViewModel3 giftViewModel3 = this.f32504v;
        long j3 = j2 & 7;
        User userM421d = null;
        int i2 = 0;
        if (j3 != 0) {
            MutableLiveData<User> mutableLiveData = giftViewModel3 != null ? giftViewModel3.f31573l : null;
            m404r(0, mutableLiveData);
            userM421d = mutableLiveData != null ? mutableLiveData.m421d() : null;
            if (userM421d != null) {
                nextLevelExps = userM421d.getNextLevelExps();
                diamonds = userM421d.getDiamonds();
                level = userM421d.getLevel();
                coins = userM421d.getCoins();
            } else {
                nextLevelExps = 0;
                diamonds = 0;
                level = 0;
                coins = 0;
            }
            z = nextLevelExps > 0;
            String string2 = Integer.toString(diamonds);
            String string3 = Integer.toString(level);
            string = Integer.toString(coins);
            if (j3 != 0) {
                j2 = z ? j2 | 16 : j2 | 8;
            }
            str2 = string2;
            str = string3;
        } else {
            str = null;
            str2 = null;
            string = null;
            nextLevelExps = 0;
            level = 0;
            z = false;
        }
        if ((16 & j2) != 0) {
            if (userM421d != null) {
                currentLevelExps = userM421d.getCurrentLevelExps();
                exps = userM421d.getExps();
            } else {
                currentLevelExps = 0;
                exps = 0;
            }
            i = ((exps - currentLevelExps) * 100) / (nextLevelExps - currentLevelExps);
        } else {
            i = 0;
        }
        long j4 = j2 & 7;
        if (j4 != 0 && z) {
            i2 = i;
        }
        if (j4 != 0) {
            TextViewBindingAdapter.m16406a(this.f32502t, str);
            SkuDao.a.m14051C(this.f32502t, level);
            TextViewBindingAdapter.m16406a(this.f32522y, str2);
            TextViewBindingAdapter.m16406a(this.f32523z, string);
            this.f32503u.setProgress(i2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32520A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32520A = 4L;
        }
        m401m();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: j */
    public boolean mo399j(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f32520A |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (9 != i) {
            return false;
        }
        this.f32504v = (GiftViewModel3) obj;
        synchronized (this) {
            this.f32520A |= 2;
        }
        m16396a(9);
        m401m();
        return true;
    }
}

package com.facebook.stetho.common.android;

import android.app.Dialog;
import android.content.res.Resources;
import android.view.View;
import p636z0.p752p.p753c.DialogFragment;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p752p.p753c.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentCompatSupportLib extends FragmentCompat<Fragment, DialogFragment, FragmentManager, FragmentActivity> {
    private static final DialogFragmentAccessorSupportLib sDialogFragmentAccessor;
    private static final FragmentAccessorSupportLib sFragmentAccessor;
    private static final FragmentActivityAccessorSupportLib sFragmentActivityAccessor;
    private static final FragmentCompat.FragmentManagerAccessorViaReflection<FragmentManager, Fragment> sFragmentManagerAccessor = new FragmentCompat.FragmentManagerAccessorViaReflection<>();

    public static class DialogFragmentAccessorSupportLib extends FragmentAccessorSupportLib implements DialogFragmentAccessor<DialogFragment, Fragment, FragmentManager> {
        private DialogFragmentAccessorSupportLib() {
            super();
        }

        @Override // com.facebook.stetho.common.android.DialogFragmentAccessor
        public Dialog getDialog(DialogFragment dialogFragment) {
            return dialogFragment.f38391n0;
        }
    }

    public static class FragmentAccessorSupportLib implements FragmentAccessor<Fragment, FragmentManager> {
        private FragmentAccessorSupportLib() {
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public FragmentManager getChildFragmentManager(Fragment fragment) {
            return fragment.m16570w();
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public FragmentManager getFragmentManager(Fragment fragment) {
            return fragment.f38450y;
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public int getId(Fragment fragment) {
            return fragment.f38406C;
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public Resources getResources(Fragment fragment) {
            return fragment.m16539M();
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public String getTag(Fragment fragment) {
            return fragment.f38408E;
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public View getView(Fragment fragment) {
            return fragment.f38416M;
        }
    }

    public static class FragmentActivityAccessorSupportLib implements FragmentActivityAccessor<FragmentActivity, FragmentManager> {
        private FragmentActivityAccessorSupportLib() {
        }

        @Override // com.facebook.stetho.common.android.FragmentActivityAccessor
        public FragmentManager getFragmentManager(FragmentActivity fragmentActivity) {
            return fragmentActivity.m16577C();
        }
    }

    static {
        sFragmentAccessor = new FragmentAccessorSupportLib();
        sDialogFragmentAccessor = new DialogFragmentAccessorSupportLib();
        sFragmentActivityAccessor = new FragmentActivityAccessorSupportLib();
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    /* JADX INFO: renamed from: forFragmentManager */
    public FragmentManagerAccessor<FragmentManager, Fragment> forFragmentManager2() {
        return sFragmentManagerAccessor;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public Class<DialogFragment> getDialogFragmentClass() {
        return DialogFragment.class;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public Class<FragmentActivity> getFragmentActivityClass() {
        return FragmentActivity.class;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public Class<Fragment> getFragmentClass() {
        return Fragment.class;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public DialogFragmentAccessor<DialogFragment, Fragment, FragmentManager> forDialogFragment() {
        return sDialogFragmentAccessor;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public FragmentAccessor<Fragment, FragmentManager> forFragment() {
        return sFragmentAccessor;
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public FragmentActivityAccessorSupportLib forFragmentActivity() {
        return sFragmentActivityAccessor;
    }
}

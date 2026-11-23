package mtp.media.karaoke.p628ui.screen.search;

import android.app.SearchManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import me.gujun.android.taggroup.TagGroup;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Keyword;
import p007c.p190n.p194b.p334e.p336b0.TabLayoutMediator;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p481d0.Strings5;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchActivity2;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchActivity3;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchActivity4;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchActivity5;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchKeywordAdapter;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchPagerAdapter;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchViewModel;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchViewModel2;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchViewModel3;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchViewModel4;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchViewModel5;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchViewModel6;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchViewModel7;
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.KeywordEntity;
import p555j.p556a.p557a.p616i.SearchActivityBinding;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p752p.C8310a;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: SearchActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SearchActivity extends BaseActivity3<SearchActivityBinding, SearchViewModel7> implements SearchView.InterfaceC0079l {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f33869w = 0;

    /* JADX INFO: renamed from: A */
    public SearchView f33870A;

    /* JADX INFO: renamed from: D */
    public SearchPagerAdapter f33873D;

    /* JADX INFO: renamed from: E */
    public HashMap f33874E;

    /* JADX INFO: renamed from: z */
    public boolean f33877z;

    /* JADX INFO: renamed from: x */
    public final int f33875x = R.layout.search_activity;

    /* JADX INFO: renamed from: y */
    public final Lazy3 f33876y = LazyJVM.m13020a(Lazy4.NONE, new C7339b(this, null, null));

    /* JADX INFO: renamed from: B */
    public final SearchKeywordAdapter f33871B = new SearchKeywordAdapter(new C7340c());

    /* JADX INFO: renamed from: C */
    public String f33872C = "";

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.search.SearchActivity$a */
    /* JADX INFO: compiled from: java-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class C7338a implements TagGroup.InterfaceC7226e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f33878a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f33879b;

        public C7338a(int i, Object obj) {
            this.f33878a = i;
            this.f33879b = obj;
        }

        @Override // me.gujun.android.taggroup.TagGroup.InterfaceC7226e
        /* JADX INFO: renamed from: a */
        public final void mo14321a(String str) {
            int i = this.f33878a;
            if (i == 0) {
                SearchActivity searchActivity = (SearchActivity) this.f33879b;
                Intrinsics2.m13088d(str, "tag");
                SearchActivity.m14430V(searchActivity, str);
            } else {
                if (i != 1) {
                    throw null;
                }
                SearchActivity searchActivity2 = (SearchActivity) this.f33879b;
                Intrinsics2.m13088d(str, "tag");
                SearchActivity.m14430V(searchActivity2, str);
            }
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.search.SearchActivity$b */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7339b extends Lambda implements InterfaceC6153a<SearchViewModel7> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33880g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33881h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33882i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7339b(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33880g = viewModelStoreOwner;
            this.f33881h = qualifier;
            this.f33882i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.o.n] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public SearchViewModel7 mo2c() {
            return SkuDao.a.m14107t(this.f33880g, Reflection.m13097a(SearchViewModel7.class), this.f33881h, this.f33882i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.search.SearchActivity$c */
    /* JADX INFO: compiled from: SearchActivity.kt */
    public static final class C7340c extends Lambda implements InterfaceC6164l<Keyword, Unit> {
        public C7340c() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Keyword keyword) {
            Keyword keyword2 = keyword;
            Intrinsics2.m13089e(keyword2, "it");
            SearchActivity searchActivity = SearchActivity.this;
            SearchView searchView = searchActivity.f33870A;
            if (searchView != null) {
                searchView.m194B(keyword2.getName(), true);
            }
            RecyclerView recyclerView = (RecyclerView) searchActivity.m14431U(R.id.recyclerSuggest);
            Intrinsics2.m13088d(recyclerView, "recyclerSuggest");
            SkuDao.a.m14109v(recyclerView);
            LinearLayout linearLayout = (LinearLayout) searchActivity.m14431U(R.id.layoutSearchPage);
            Intrinsics2.m13088d(linearLayout, "layoutSearchPage");
            SkuDao.a.m14109v(linearLayout);
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.search.SearchActivity$d */
    /* JADX INFO: compiled from: SearchActivity.kt */
    public static final class C7341d extends Lambda implements InterfaceC6153a<Unit> {
        public C7341d() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            SearchViewModel7 searchViewModel7Mo13969R = SearchActivity.this.mo13969R();
            Objects.requireNonNull(searchViewModel7Mo13969R);
            C5729a.m12428A(C8310a.m16440e(searchViewModel7Mo13969R), null, 0, new SearchViewModel2(searchViewModel7Mo13969R, null), 3, null);
            ((TagGroup) SearchActivity.this.m14431U(R.id.tagGroupRecent)).removeAllViews();
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.search.SearchActivity$e */
    /* JADX INFO: compiled from: SearchActivity.kt */
    public static final class C7342e<T> implements Observer<List<? extends KeywordEntity>> {
        public C7342e() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(List<? extends KeywordEntity> list) {
            SearchActivity searchActivity = SearchActivity.this;
            int i = SearchActivity.f33869w;
            searchActivity.m13968Q().mo398f();
        }
    }

    /* JADX INFO: renamed from: V */
    public static final void m14430V(SearchActivity searchActivity, String str) {
        SearchView searchView = searchActivity.f33870A;
        if (searchView != null) {
            searchView.m194B(str, true);
        }
        RecyclerView recyclerView = (RecyclerView) searchActivity.m14431U(R.id.recyclerSuggest);
        Intrinsics2.m13088d(recyclerView, "recyclerSuggest");
        SkuDao.a.m14109v(recyclerView);
        LinearLayout linearLayout = (LinearLayout) searchActivity.m14431U(R.id.layoutSearchPage);
        Intrinsics2.m13088d(linearLayout, "layoutSearchPage");
        SkuDao.a.m14109v(linearLayout);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33875x;
    }

    /* JADX INFO: renamed from: U */
    public View m14431U(int i) {
        if (this.f33874E == null) {
            this.f33874E = new HashMap();
        }
        View view = (View) this.f33874E.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33874E.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public SearchViewModel7 mo13969R() {
        return (SearchViewModel7) this.f33876y.getValue();
    }

    @Override // androidx.appcompat.widget.SearchView.InterfaceC0079l
    /* JADX INFO: renamed from: j */
    public boolean mo216j(String str) {
        String string;
        LinearLayout linearLayout = (LinearLayout) m14431U(R.id.searchResultLayout);
        Intrinsics2.m13088d(linearLayout, "searchResultLayout");
        SkuDao.a.m14109v(linearLayout);
        this.f33872C = String.valueOf(str != null ? Strings5.m13004G(str).toString() : null);
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics2.m13091g(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            string = str.subSequence(i, length + 1).toString();
        } else {
            string = null;
        }
        if (!Intrinsics2.m13085a(string, "")) {
            String strValueOf = String.valueOf(str);
            SearchViewModel7 searchViewModel7Mo13969R = mo13969R();
            Objects.requireNonNull(searchViewModel7Mo13969R);
            Intrinsics2.m13089e(strValueOf, "q");
            C5729a.m12428A(C8310a.m16440e(searchViewModel7Mo13969R), null, 0, new SearchViewModel6(searchViewModel7Mo13969R, strValueOf, null), 3, null);
            mo13969R().f31732n.mo422e(this, new SearchActivity2(this));
        } else {
            mo13969R().f31732n.mo427j(null);
            this.f33871B.m13977p(null);
            RecyclerView recyclerView = (RecyclerView) m14431U(R.id.recyclerSuggest);
            Intrinsics2.m13088d(recyclerView, "recyclerSuggest");
            SkuDao.a.m14109v(recyclerView);
            LinearLayout linearLayout2 = (LinearLayout) m14431U(R.id.layoutSearchPage);
            Intrinsics2.m13088d(linearLayout2, "layoutSearchPage");
            SkuDao.a.m14068T(linearLayout2);
        }
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f33877z = true;
        SearchView searchView = this.f33870A;
        if (searchView != null) {
            SkuDao.a.m14110w(searchView);
        }
        finish();
        this.f143l.m133b();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) m14431U(R.id.searchContainer);
        Intrinsics2.m13088d(coordinatorLayout, "searchContainer");
        SkuDao.a.m14066R(coordinatorLayout, SkuDao.a.m14105r(this));
        m14615N((Toolbar) m14431U(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14593m(true);
            actionBarM14610I.mo14594n(false);
            actionBarM14610I.mo14595o(false);
        }
        SearchViewModel7 searchViewModel7Mo13969R = mo13969R();
        searchViewModel7Mo13969R.f31734p = false;
        if (searchViewModel7Mo13969R.f31733o.m421d() == null) {
            C5729a.m12428A(C8310a.m16440e(searchViewModel7Mo13969R), null, 0, new SearchViewModel5(searchViewModel7Mo13969R, null), 3, null);
        }
        mo13969R().f31733o.mo422e(this, new SearchActivity4(this));
        SearchViewModel7 searchViewModel7Mo13969R2 = mo13969R();
        if (searchViewModel7Mo13969R2.f31731m.m421d() == null) {
            C5729a.m12428A(C8310a.m16440e(searchViewModel7Mo13969R2), null, 0, new SearchViewModel4(searchViewModel7Mo13969R2, null), 3, null);
        }
        mo13969R().f31731m.mo422e(this, new SearchActivity3(this));
        ((RecyclerView) m14431U(R.id.recyclerSuggest)).setHasFixedSize(true);
        RecyclerView recyclerView = (RecyclerView) m14431U(R.id.recyclerSuggest);
        Intrinsics2.m13088d(recyclerView, "recyclerSuggest");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = (RecyclerView) m14431U(R.id.recyclerSuggest);
        Intrinsics2.m13088d(recyclerView2, "recyclerSuggest");
        recyclerView2.setAdapter(this.f33871B);
        this.f33873D = new SearchPagerAdapter(this);
        ViewPager2 viewPager2 = (ViewPager2) m14431U(R.id.pages);
        Intrinsics2.m13088d(viewPager2, "pages");
        SearchPagerAdapter searchPagerAdapter = this.f33873D;
        if (searchPagerAdapter == null) {
            Intrinsics2.m13096l("adapterSearchPager");
            throw null;
        }
        viewPager2.setAdapter(searchPagerAdapter);
        new TabLayoutMediator((TabLayout) m14431U(R.id.tabs), (ViewPager2) m14431U(R.id.pages), new SearchActivity5(this)).m11024a();
        ((TagGroup) m14431U(R.id.tagGroup)).setOnTagClickListener(new C7338a(0, this));
        ((TagGroup) m14431U(R.id.tagGroupRecent)).setOnTagClickListener(new C7338a(1, this));
        ImageButton imageButton = (ImageButton) m14431U(R.id.btnTrashRecent);
        Intrinsics2.m13088d(imageButton, "btnTrashRecent");
        SkuDao.a.m14067S(imageButton, new C7341d());
        mo13969R().f31733o.mo422e(this, new C7342e());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics2.m13089e(menu, "menu");
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.search, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.action_search);
        Intrinsics2.m13088d(menuItemFindItem, "menu.findItem(R.id.action_search)");
        View actionView = menuItemFindItem.getActionView();
        Objects.requireNonNull(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        this.f33870A = searchView;
        View viewFindViewById = searchView != null ? searchView.findViewById(R.id.search_edit_frame) : null;
        Objects.requireNonNull(viewFindViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) viewFindViewById).getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).leftMargin = -8;
        SearchView searchView2 = this.f33870A;
        Intrinsics2.m13087c(searchView2);
        Object systemService = getSystemService("search");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.SearchManager");
        searchView2.setSearchableInfo(((SearchManager) systemService).getSearchableInfo(getComponentName()));
        searchView2.mo202c();
        searchView2.setOnQueryTextListener(this);
        searchView2.requestFocus();
        searchView2.setMaxWidth(Integer.MAX_VALUE);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics2.m13089e(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            this.f33877z = true;
            SearchView searchView = this.f33870A;
            if (searchView != null) {
                SkuDao.a.m14110w(searchView);
            }
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f33877z) {
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
    }

    @Override // androidx.appcompat.widget.SearchView.InterfaceC0079l
    /* JADX INFO: renamed from: p */
    public boolean mo217p(String str) {
        SearchView searchView = this.f33870A;
        if (searchView != null) {
            searchView.clearFocus();
        }
        LinearLayout linearLayout = (LinearLayout) m14431U(R.id.searchResultLayout);
        Intrinsics2.m13088d(linearLayout, "searchResultLayout");
        SkuDao.a.m14068T(linearLayout);
        mo13969R().f31730l.mo427j(String.valueOf(str));
        SearchViewModel7 searchViewModel7Mo13969R = mo13969R();
        String strValueOf = String.valueOf(str);
        Objects.requireNonNull(searchViewModel7Mo13969R);
        Intrinsics2.m13089e(strValueOf, "name");
        C5729a.m12428A(C8310a.m16440e(searchViewModel7Mo13969R), null, 0, new SearchViewModel(searchViewModel7Mo13969R, strValueOf, null), 3, null);
        SearchViewModel7 searchViewModel7Mo13969R2 = mo13969R();
        String strValueOf2 = String.valueOf(str);
        Objects.requireNonNull(searchViewModel7Mo13969R2);
        Intrinsics2.m13089e(strValueOf2, "name");
        C5729a.m12428A(C8310a.m16440e(searchViewModel7Mo13969R2), null, 0, new SearchViewModel3(searchViewModel7Mo13969R2, strValueOf2, System.currentTimeMillis(), null), 3, null);
        return false;
    }
}

package com.quintus.labs.ozmarketim.helper;

import com.quintus.labs.ozmarketim.model.Category;
import com.quintus.labs.ozmarketim.model.Offer;
import com.quintus.labs.ozmarketim.model.Product;

import java.util.ArrayList;
import java.util.List;


public class Data {
    List<Category> categoryList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Product> newList = new ArrayList<>();
    List<Product> popularList = new ArrayList<>();
    List<Offer> offerList = new ArrayList<>();

    public List<Category> getCategoryList() {
        Category category = new Category("1", "Yemek", "https://sabriulkerfoundation.org/TR/img/icerik/sebze-meyve.jpg");
        categoryList.add(category);
        category = new Category("2", "Ev Ve Temizlik Ürünleri", "https://www.7kkurumsaltemizlik.com/wp-content/uploads/pendik-kurumsal-toptan-temizlik-malzemeleri-tedarikcisi.jpg");
        categoryList.add(category);
        category = new Category("3", "Bebek Bakım", "https://tips4tots.files.wordpress.com/2015/08/medical-insurance-free-icon.png");
        categoryList.add(category);
        category = new Category("4", "Spor ve Beslenme", "https://dietmfb.com/wp-content/uploads/2018/11/SPOR-BESLENME-600X409.jpg");
        categoryList.add(category);
        category = new Category("5", "Hayvan Bakım", "http://kasperstromman.files.wordpress.com/2013/05/dog-cat-above-board.jpg");
        categoryList.add(category);
        category = new Category("6", "Sağlık ve Günlük", "https://thumbs.dreamstime.com/b/household-cleaning-products-accessories-basket-there-mop-detergents-rubber-gloves-glass-cleaner-sponges-89944820.jpg");
        categoryList.add(category);
        return categoryList;
    }

    public List<Product> getProductList() {
        Product product = new Product("1", "1", "Elma", "", "1 Kg", "₺", "20", "10%", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        productList.add(product);
        product = new Product("2", "1", "Muz", "", "1 Kg", "₺", "10", "20%", "https://images-na.ssl-images-amazon.com/images/I/21DejQuoT2L.jpg");
        productList.add(product);
        product = new Product("3", "2", "Camsil", "", "500 mL", "₺", "35", "", "https://productimages.hepsiburada.net/s/34/375/10443833344050.jpg");
        productList.add(product);
        product = new Product("4", "2", "Vileda", "", "1 Adet", "₺", "10", "", "https://www.clean-hoouse.com/wp-content/uploads/2017/09/13.png");
        productList.add(product);
        product = new Product("5", "3", "Bebek Bezi", "", "1 Paket", "₺", "20", "10% ", "https://cdn.bmstores.co.uk/images/hpcProductImage/imgFull/311448-Pampers-Baby-Dry-Size-4-Maxi-251.jpg");
        productList.add(product);
        product = new Product("6", "3", "Dalin Bebek Yağı", "", "100 mL", "₺", "31", "", "https://productimages.hepsiburada.net/s/29/1500/10251286478898.jpg");
        productList.add(product);
        product = new Product("7", "4", "Elma", "", "1 Kg", "₺", "20", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        productList.add(product);
        product = new Product("8", "6", "Elma", "", "1 Kg", "₺", "20", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        productList.add(product);
        product = new Product("9", "1", "Domates", "", "1 Kg", "₺", "20", "30%", "https://reimg-carrefour.mncdn.com/mnresize/600/600/productimage/30014353/30014353_0_MC/8796371517490_1528879440170.jpg");
        productList.add(product);
        return productList;
    }

    public List<Product> getNewList() {
        Product product = new Product("1", "1", "Elma", "", "1 Kg", "₺", "20", "10% ", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        newList.add(product);
        product = new Product("2", "1", "Muz", "", "1 Adet", "₺", "10", "20% ", "https://images-na.ssl-images-amazon.com/images/I/21DejQuoT2L.jpg");
        newList.add(product);
        product = new Product("3", "2", "Camsil", "", "500 mL", "₺", "35", "", "https://productimages.hepsiburada.net/s/34/375/10443833344050.jpg");
        newList.add(product);
        product = new Product("4", "2", "Vileda", "", "1 Adet", "₺", "10", "", "https://n11scdn.akamaized.net/a1/1024/ev-yasam/temizlik-urunleri/temizlik-seti-vileda-paspas-mop-doner-sikma-aparatli-temizlik-m__0929200685209375.jpg");
        newList.add(product);
        product = new Product("5", "3", "Bebek Bezi", "", "1 Paket", "20", "₺", "10% ", "https://cdn.bmstores.co.uk/images/hpcProductImage/imgFull/311448-Pampers-Baby-Dry-Size-4-Maxi-251.jpg");
        newList.add(product);
        return newList;
    }

    public List<Product> getPopularList() {
        Product product = new Product("6", "3", "Dalin Bebek Yağı", "", "100 mL", "₺", "30.99", "", "https://productimages.hepsiburada.net/s/29/1500/10251286478898.jpg");
        popularList.add(product);
        product = new Product("7", "4", "Elma", "", "1 Kg", "₺", "20", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        popularList.add(product);
        product = new Product("8", "4", "Ananas", "", "1 Kg", "₺", "20", "", "https://reimg-carrefour.mncdn.com/mnresize/600/600/productimage/30009119/30009119_0_MC/8796375580722_1528879431625.jpg");
        popularList.add(product);
        product = new Product("9", "1", "Domates", "", "1 Kg", "₺", "20", "30%", "https://reimg-carrefour.mncdn.com/mnresize/600/600/productimage/30014353/30014353_0_MC/8796371517490_1528879440170.jpg");
        popularList.add(product);
        return popularList;
    }

    public List<Offer> getOfferList() {
        Offer offer = new Offer("https://cdnuploads.aa.com.tr/uploads/sirkethaberleri/Contents/2020/10/05/thumbs_b_c_56da7e2eede6e9f2730e53fa3be5b567.jpg");
        offerList.add(offer);
        offer = new Offer("https://www.bonus.com.tr/assets/images/imported/tre_220321.jpg");
        offerList.add(offer);
        offer = new Offer("https://cdn.dsmcdn.com/marketing/datascience/automation/BrandBoutique/2020/11/5/RakipsizFirsatlar_section1_202011051806_webBig.jpg");
        offerList.add(offer);
        offer = new Offer("https://cdn.dsmcdn.com/assets/t/y/creative/bnr/Mails/2021/mar/08/images/f.gif");
        offerList.add(offer);
        offer = new Offer("https://cdnuploads.aa.com.tr/uploads/sirkethaberleri/Contents/2021/04/27/thumbs_b_c_0c1cb4fc146a4cc76695650d11c443c3.jpg");
        offerList.add(offer);
        offer = new Offer("https://static.daktilo.com/sites/415/uploads/2021/03/09/large/cover-trendyol-super-mart-indirimleri.jpg");
        offerList.add(offer);


        return offerList;
    }
}

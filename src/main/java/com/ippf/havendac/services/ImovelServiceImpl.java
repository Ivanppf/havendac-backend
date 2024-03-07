package com.ippf.havendac.services;


import com.ippf.havendac.entities.Imovel;
import com.ippf.havendac.repository.ImovelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ImovelServiceImpl implements GenericCRUDService<Imovel> {

    private final ImovelRepository imovelRepository;

    @Override
    public Imovel findById(int id) {
        return imovelRepository.findById(id).orElseThrow(() -> new RuntimeException("Imovel com id " + id + " não encontrado"));
    }

    @Override
    public List<Imovel> findAll() {
        return imovelRepository.findAll();
    }

    @Override
    public Imovel save(Imovel obj) {
        return imovelRepository.save(obj);
    }

    @Override
    public Imovel update(int id, Imovel obj) {
        findById(id);
        return imovelRepository.save(obj);
    }

    @Override
    public String deleteById(int id) {
        findById(id);
        imovelRepository.deleteById(id);
        return "Imovel com id " + id + " deletado com sucesso";
    }
}
